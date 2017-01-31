package com.sample.Gradle.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.Gradle.model.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{

}
