package com.shiva.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "omega", uniqueConstraints = @UniqueConstraint(columnNames = "uid"))
@SecondaryTable(name = "email", pkJoinColumns = @PrimaryKeyJoinColumn(name = "eid"))
public class omega
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String Firstname;
	private String LastName;
	private String EmailAdd;
	private int phNo;
	@Embedded
	email email;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailAdd() {
		return EmailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		EmailAdd = emailAdd;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "omega [uid=" + uid + ", Firstname=" + Firstname + ", LastName=" + LastName + ", EmailAdd=" + EmailAdd
				+ ", phNo=" + phNo + "]";
	}
	
}

