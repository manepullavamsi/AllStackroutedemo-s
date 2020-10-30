package com.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.exception.CourseAlreadyExists;
import com.springboot.exception.CourseNotFound;
import com.springboot.model.Course;

@Service
public interface ICOurseService {
	public Course saveCourse(Course course) throws CourseAlreadyExists;
	
	public Course updateCourse(Course course)throws CourseAlreadyExists;
	
	public boolean deleteCourse(int courseId)throws CourseAlreadyExists;
	
	public List<Course> getAllCourses()throws CourseAlreadyExists;
	
	public Course getCourseById(int courseId)throws CourseNotFound;
}
