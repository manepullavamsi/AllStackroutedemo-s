package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Exception.CourseAlreadyExists;
import com.example.demo.Exception.CourseNotFound;
import com.example.demo.Model.Course;


@Service
public interface ICourseServices {

public Course saveCourse(Course course) throws CourseAlreadyExists;
	
	public Course updateCourse(Course course)throws CourseAlreadyExists;
	
	public boolean deleteCourse(int courseId)throws CourseNotFound;
	
	public List<Course> getAllCourses()throws CourseAlreadyExists;
	
	public Course getCourseById(int courseId)throws CourseNotFound;

}
