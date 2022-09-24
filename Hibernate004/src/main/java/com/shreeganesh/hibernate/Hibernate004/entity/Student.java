package com.shreeganesh.hibernate.Hibernate004.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_country")
	private String country;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "passport_id")
	private Passport passsport;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Passport getPasssport() {
		return passsport;
	}

	public void setPasssport(Passport passsport) {
		this.passsport = passsport;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + ", passsport=" + passsport + "]";
	}

}
