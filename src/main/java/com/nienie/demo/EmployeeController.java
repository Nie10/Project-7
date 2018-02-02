package com.nienie.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{employeeNumber}")
    public Employee getEmployee(@PathVariable Long employeeNumber){
        return employeeService.getEmployee(employeeNumber);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{employeeNumber}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable Long employeeNumber){
        employeeService.updateEmployee(employeeNumber, employee);
    }


    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{employeeNumber}")
    public void deleteEmployee(@PathVariable Long employeeNumber){
        employeeService.deleteEmployee(employeeNumber);
    }

}
