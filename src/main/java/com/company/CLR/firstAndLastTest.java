package com.company.CLR;

import com.company.beans.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
@RequiredArgsConstructor
public class firstAndLastTest implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;

    private final String addURL = "http://localhost:8080/company/add";
    private final String getURL = "http://localhost:8080/company/get/"+22;
    private final String getAllURL = "http://localhost:8080/company/getAll";
    private final String getByNameURL = "http://localhost:8080/company/getByName/zeev";

    @Override
    public void run(String... args) throws Exception {

        Employee employee = Employee.builder()
                .name("zeev")
                .salary(37_850)
                .build();

        System.out.println("=================================");

        System.out.println("The ID of the employee we added is : "
                + restTemplate.postForObject(addURL, employee, Long.class));

        System.out.println("=================================");

        System.out.println("Showing details about employee ID=22 :");

        System.out.println(restTemplate.getForObject(getURL,Employee.class));

        System.out.println("=================================");

        System.out.println("Show all employee: ");

        ResponseEntity<Employee[]> employees = restTemplate.getForEntity(getAllURL,Employee[].class);

        List<Employee> employeeList = Arrays.asList(employees.getBody());

        System.out.println(employeeList);

        System.out.println("=================================");

        System.out.println("Show all employee by name: (zeev)");

        ResponseEntity<Employee[]> employee2 = restTemplate.getForEntity(getByNameURL,Employee[].class);

        List<Employee> employeeList2 = Arrays.asList(employee2.getBody());

        System.out.println(employeeList2);

        System.out.println("=================================");


    }
}
