package com.nienie.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        List<Employee>employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Employee getEmployee(Long employeeNumber){
        return employeeRepository.findOne(employeeNumber);
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(Long employeeNumber, Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeNumber){
        employeeRepository.delete(employeeNumber);
    }

}
