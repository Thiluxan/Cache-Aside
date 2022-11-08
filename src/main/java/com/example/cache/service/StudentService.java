package com.example.cache.service;

import com.example.cache.model.Student;
import com.example.cache.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).get();
    }

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }
}
