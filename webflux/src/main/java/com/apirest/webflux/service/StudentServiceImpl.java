package com.apirest.webflux.service;

import com.apirest.webflux.Repository.StudentRepository;
import com.apirest.webflux.document.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository sr;

    @Override
    public Flux<Student> findAll() {
        return sr.findAll();
    }

    @Override
    public Mono<Student> findById(String id) {
        return sr.findById(id);
    }

    @Override
    public Mono<Student> save(Student student) {
        return sr.save(student);
    }
}
