package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Course;

@Repository
public interface ICourseRepo extends MongoRepository<Course,Integer> {

}
