package com.apirest.webflux.controller;

import com.apirest.webflux.Repository.StudentRepository;
import com.apirest.webflux.document.Student;
import com.apirest.webflux.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentsController {

    @Autowired
    StudentService service;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Flux<Student> getStudents() {
        return service.findAll();
    }

    @RequestMapping(value = "students/{id}", method = RequestMethod.GET)
    public Mono<Student> getStudent(@PathVariable  String id){
        return service.findById(id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Mono<Student> save(@RequestBody Student student){
        return service.save(student);
    }

}
