package com.example.simplespringcrud.service;

import com.example.simplespringcrud.repository.EmployeeRepository;
import com.example.simplespringcrud.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee e = null;
        Optional<Employee> result  =employeeRepository.findById(id);
        if (result.isPresent()){
            e = result.get();
        }
        return e;
    }

    @Override

    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override

    public void update(Employee employee) {
        employeeRepository.save(employee);

    }


    public void delete(int id) {
        employeeRepository.deleteById(id);

    }

    @Override

    public void deleteAll() {
        employeeRepository.deleteAll();
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
