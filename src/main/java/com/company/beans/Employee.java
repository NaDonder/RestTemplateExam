package com.company.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String name;
	@Column
	private double salary;
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<Job> jobs= new ArrayList<>();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", jobs=" + jobs + "]\n";
	}

}
