package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Student_Service
{
	@Autowired
	private Student_Service_Repository repo;
	public List<Student> listAll()
	{
	return repo.findAll();
	}
	public void save(Student stud)
	{
	repo.save(stud);
	}
	public Student get(Integer st_id)
	{
	return repo.findById(st_id).get();
	}
	public void delete(Integer st_id)
	{
	repo.deleteById(st_id);
	}
}
