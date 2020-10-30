package com.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.exception.CourseAlreadyExists;
import com.springboot.exception.CourseNotFound;
import com.springboot.model.Course;
import com.springboot.repository.Icourserepo;

@Service
public class ICOurseImpl implements ICOurseService {
	
	@Autowired
	public Icourserepo icourse;

	@Override
	public Course saveCourse(Course course) throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		
		Optional<Course> optional= this.icourse.findById(course.getCourseId());
		
		if(optional.isPresent())
		{
			throw new CourseAlreadyExists();
		}
		
	Course data=this.icourse.save(course);
	return data;
	}

	@Override
	public Course updateCourse(Course course)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(int courseId) throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> getAllCourses() throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		return this.icourse.findAll();
	}

	@Override
	public Course getCourseById(int courseId) throws CourseNotFound {
		// TODO Auto-generated method stub
		return null;
	}

}
