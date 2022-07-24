package kodlama.io;

import java.util.ArrayList;

public class Student extends User {
	
	
	private ArrayList<Course> courses;
	


	public Student() {
		courses = new ArrayList<Course>();
	}

	



	public ArrayList<Course> getCourses() {
		return courses;
	}






	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}






	

	

	
	
	
}
