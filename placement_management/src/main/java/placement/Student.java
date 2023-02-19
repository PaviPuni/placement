package placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
	private Integer St_id;
	private String St_name;
	private String St_mail;
    private String St_gender;
    
    
    public Student() {
		super();
	}
	public Student(Integer st_id, String st_name, String st_mail, String st_gender) {
		super();
		St_id = st_id;
		St_name = st_name;
		St_mail = st_mail;
		St_gender = st_gender;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getSt_id() {
		return St_id;
	}
	public void setSt_id(Integer st_id) {
		St_id = st_id;
	}
	public String getSt_name() {
		return St_name;
	}
	public void setSt_name(String st_name) {
		St_name = st_name;
	}
	public String getSt_mail() {
		return St_mail;
	}
	public void setSt_mail(String st_mail) {
		St_mail = st_mail;
	}
	public String getSt_gender() {
		return St_gender;
	}
	public void setSt_gender(String st_gender) {
		St_gender = st_gender;
	}
	@Override
	public String toString() {
		return "Student [St_id=" + St_id + ", St_name=" + St_name + ", St_mail=" + St_mail + ", St_gender=" + St_gender
				+ "]";
	}
	
	
}
