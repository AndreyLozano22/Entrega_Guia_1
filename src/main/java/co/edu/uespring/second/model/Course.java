package co.edu.uespring.second.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import co.edu.uespring.second.model.Course;

@XmlRootElement

public class Course {
	private String name;
	private double duration;
	private double cost;
	private int ability;

	public Course(String name, double duration, double cost, int ability) {
		super();
		this.name = name;
		this.duration = duration;
		this.cost = cost;
		this.ability = ability;
	}
	
	public Course() {
		super();
	}
	
	public ArrayList<Course> myListCourses(){
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course ("JavaScript",20.0,10.0,24));
		courses.add(new Course ("Java",40.0,20.0,24));
		courses.add(new Course ("PHP",40.0,12.0,24));
		return courses;
	}
	
	public ArrayList<Course> searchCourses(String name){
		ArrayList<Course> courses_aux = new ArrayList<>();
		ArrayList<Course> courses_return = new ArrayList<>();
		
		courses_aux = this.myListCourses();
		System.out.println("Metodo" + name);
		for(Course course: courses_aux) {
			if(course.getName().contains(name)) {
				courses_return.add(course);
			}
		}
		
		return courses_return;
	}
	
	public ArrayList<Course> postCourse(Course curso){
		ArrayList<Course> course = myListCourses();
		
		return course;
	}
	
	public ArrayList<Course> putCourse(String name,String nameNew, double duration, double cost, int ability) {
	    ArrayList<Course> cuerses = myListCourses();

	    for (Course course : cuerses) {
	        if (course.getName().equals(name)) {
	        	course.setName(nameNew);
	        	course.setDuration(duration);
	        	course.setCost(cost);
	        	course.setAbility(ability);
	            break;
	        }
	    }

	    return cuerses;
	}
	
	public ArrayList<Course> deleteCourse(String name){
		ArrayList<Course> cuerse = new ArrayList<>();
		cuerse = myListCourses();
		cuerse.removeIf(c->c.getName().equals(name));
		return cuerse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getAbility() {
		return ability;
	}

	public void setAbility(int ability) {
		this.ability = ability;
	}
	

}
