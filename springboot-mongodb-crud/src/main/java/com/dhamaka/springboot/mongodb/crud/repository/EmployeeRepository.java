package com.dhamaka.springboot.mongodb.crud.repository;

import com.dhamaka.springboot.mongodb.crud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
