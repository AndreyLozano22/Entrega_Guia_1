package co.edu.ue.spring.second.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.uespring.second.model.Course;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CourseController {
	
	Course  course;
	
	@PostConstruct
	public void init() {
		course = new Course();
	}
	
	
	@GetMapping(value="courses/{name}",produces = MediaType.APPLICATION_XML_VALUE)
	public List<Course> searchCourse(@PathVariable("name") String nam) {
		return course.searchCourses(nam);
	}
	
	@GetMapping(value="courses",produces = MediaType.APPLICATION_XML_VALUE)
	public List<Course> getCourses() {
		return course.myListCourses();
	}
	
	@GetMapping(value="course",produces = MediaType.APPLICATION_XML_VALUE)
	public Course getCourse() {
		return new Course("JavaScript",20.0,10.0,24);
	}
	
	@PostMapping( value="Curso", consumes=MediaType.APPLICATION_XML_VALUE, produces=MediaType.APPLICATION_XML_VALUE)
	public List<Course> postCourse(@RequestBody Course c){
		return course.postCourse(c);
	}

	@PutMapping(value = "course/{name}", consumes = MediaType.APPLICATION_XML_VALUE , produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Course> putCourse(@PathVariable("name") String name, @RequestBody Course courseToUpdate) {
	      
	    return course.putCourse(name, courseToUpdate.getName(), courseToUpdate.getDuration(),courseToUpdate.getCost() , courseToUpdate.getAbility()) ; 
	}


	@DeleteMapping(value="courses/{name}")
	public List<Course> deleteCourse(@PathVariable("name") String name) {
		return course.deleteCourse(name);
	}
}
