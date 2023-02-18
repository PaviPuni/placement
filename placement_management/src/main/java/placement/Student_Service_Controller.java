package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Service_Controller
{
	@Autowired(required=true)
	private Student_Service service;
	@GetMapping("/studentservice")
	public java.util.List<Student> list()
	{
	return service.listAll();
	}
	@GetMapping("/studentservice/{st_id}")
	public ResponseEntity<Student> get(@PathVariable Integer St_id)
	{
	try
	{
	Student stud=service.get(St_id);
	return new ResponseEntity<Student>(stud,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
	return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/studentservice")
	public void add(@RequestBody Student stud)
	{
	service.save(stud);
	}
	@PutMapping("/studentservice/{st_id}")
	public ResponseEntity<?> update(@RequestBody Student stud, @PathVariable Integer
	St_id)
	{
	Student existstud=service.get(St_id);
	service.save(existstud);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/studentservice/{st_id}")
	public void delete(@PathVariable Integer st_id)
	{
	service.delete(st_id);
	}
}
