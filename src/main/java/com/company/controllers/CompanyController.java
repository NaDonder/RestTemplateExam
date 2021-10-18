package com.company.controllers;

import com.company.Company;
import com.company.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private Company company;

    @PostMapping("add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Long addEmployee(@RequestBody Employee employee) {
        return company.addEmployee(employee);
    }

    @GetMapping("get/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return company.getEmployee(id);
    }

    @GetMapping("getAll")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Employee> getAllEmployee() {
        return company.getEmployees();
    }

    @GetMapping("getByName/{name}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return company.getEmployee(name);
    }
}
