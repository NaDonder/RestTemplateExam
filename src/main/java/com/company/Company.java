package com.company;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.beans.Employee;
import com.company.beans.Job;
import com.company.repo.EmployeeRepository;
import com.company.repo.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class Company {

	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private JobRepository jobRepo;
	
	public Long addEmployee(Employee e){
		empRepo.save(e);
		return e.getId();
	}
	
	public Optional<Employee> getEmployee(long empId){
		return empRepo.findById(empId);
	}
	
	public List<Employee> getEmployee(String name){
		return empRepo.findEmployeeByName(name);
	}
	
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}
	
	public List<Job> getJobs(){
		return jobRepo.findAll();
	}

	public List<Job> getJobs(Date endDate){
		return jobRepo.findJobByEndDate(endDate);
	}
	
	public List<Job> getJobs(Date start, Date end){
		return jobRepo.findJobByEndDateBetween(start, end);
	}
}
