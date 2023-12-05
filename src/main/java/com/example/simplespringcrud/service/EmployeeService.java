package com.example.simplespringcrud.service;

import com.example.simplespringcrud.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {

    //findAll
    List<Employee> findAll();

    //find by Id
    Employee findById(int id);

    //add employee
    Employee add(Employee employee);

    //update employee
    void update(Employee employee);

    //delete employee
    void delete(int id);

    // delete all
    public void deleteAll();

    void delete(Employee employee);
}
