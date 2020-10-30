package com.spring.dao;

import java.util.List;

import com.spring.model.Course;

public interface ICourseDao {
	public boolean saveCOurse(Course course);
	
	public boolean updateCourse(Course course);
	
	public boolean deleteCourse(int courseId);
	
	public  List<Course> getCourses();
	
	public Course getCourseById(int courseId);
	
	

}
