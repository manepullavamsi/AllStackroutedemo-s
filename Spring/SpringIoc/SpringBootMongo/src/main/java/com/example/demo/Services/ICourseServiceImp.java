package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.CourseAlreadyExists;
import com.example.demo.Exception.CourseNotFound;
import com.example.demo.Model.Course;
import com.example.demo.repository.ICourseRepo;

@Service
public class ICourseServiceImp implements ICourseServices {
	
	@Autowired
	private ICourseRepo courserepo;

	@Override
	public Course saveCourse(Course course) throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		Course courseadded;
		Optional<Course> optional=this.courserepo.findById(course.getCourseId());
		if(optional.isPresent())
		{
			throw new CourseAlreadyExists();
		}
		else
		{
			courseadded=this.courserepo.save(course);
		}
		return course;
	}

	@Override
	public Course updateCourse(Course course) throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		
		Course courseUpdate;
		Optional<Course> optional=this.courserepo.findById(course.getCourseId());
		if(optional.isPresent())
		{
			
			courseUpdate=this.courserepo.save(course);
		}
		else
		{
			throw new CourseAlreadyExists();
		}
		return courseUpdate;
		
	}

	@Override
	public boolean deleteCourse(int courseId) throws CourseNotFound {
		// TODO Auto-generated method stub
		boolean deleteStatus;
		Optional<Course> optional=this.courserepo.findById(courseId);
		if(optional.isPresent())
		{
			
			this.courserepo.delete(optional.get());
			deleteStatus=true;
		}
		else
		{
			throw new CourseNotFound();
		}
		return deleteStatus;
	}

	@Override
	public List<Course> getAllCourses() throws CourseAlreadyExists {
		// TODO Auto-generated method stub
		return this.courserepo.findAll();
	}

	@Override
	public Course getCourseById(int courseId) throws CourseNotFound {
		// TODO Auto-generated method stub
		Course course;
		Optional<Course> optional=this.courserepo.findById(courseId);
		if(optional.isPresent())
		{
			
			course=optional.get();
		}
		else
		{
			throw new CourseNotFound();
		}
		return course;
	}

}
