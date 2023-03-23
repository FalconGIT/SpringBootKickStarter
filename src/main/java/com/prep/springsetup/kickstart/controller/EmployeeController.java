package com.prep.springsetup.kickstart.controller;

import com.prep.springsetup.kickstart.repository.EmployeeRepo;
import com.prep.springsetup.kickstart.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping(value = "/v1/Employees/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Employee>> getAllEmployees() {
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @PostMapping("/v1/Employees/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeRepo.save(employee), HttpStatus.OK);
    }
}
