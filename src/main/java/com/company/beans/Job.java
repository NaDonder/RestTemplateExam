package com.company.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String description;
	@Column
	private Date endDate;

	@Override
	public String toString() {
		return "Job [id=" + id + ", description=" + description + ", endDate=" + endDate + "]";
	}
}
