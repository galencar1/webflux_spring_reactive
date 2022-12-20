package com.apirest.webflux.Repository;

import com.apirest.webflux.document.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

}
