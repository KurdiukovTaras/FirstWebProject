package com.websystique.springmvc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min=3, max=25)
	@Column(name = "NAME", nullable = false)
	private String name;



	@NotNull
	@Column(name = "CREATEDDATE", nullable = false)
	private Timestamp createdDate;


	@NotNull
	@Column(name = "AGE", nullable = false)
	private Integer age;

	@NotNull
	@Column(name = "ISADMIN", nullable = false)
	private Boolean isAdmin;

	public Timestamp getCreatedDate() {return createdDate;}

	public void setCreatedDate(Timestamp createdDate) {this.createdDate = createdDate;}

	public Boolean getIsAdmin() {return isAdmin;}

	public void setIsAdmin(Boolean admin) {isAdmin = admin;}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", isAdmin="+isAdmin+", createdDate="
				+ createdDate +  "]";
	}
	
	
	

}
