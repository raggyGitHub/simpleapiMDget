package com.amigoscode.apiMongoDB.service;

import com.amigoscode.apiMongoDB.model.Student;
import com.amigoscode.apiMongoDB.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;
    public List<Student> getAllStudents(){
     return studentRepository.findAll();
    }
}
