package com.traxcrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billings")
public class billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name",length=45,nullable=false)
	private String firstname;
	@Column(name="last_name",length=45,nullable=false)
	private String lastname;
	@Column(name="email",length=45,nullable=false,unique=true)
	private String email;
	@Column(name="mobile",length=45,nullable=false,unique=true)
	private long mobile;
	@Column(name="lead_source")
	private String leadsource;
	@Column(name="gender")
	private String gender;
	@Column(name="productname",length=45)
	private String productname;
	@Column(name="amount",length=45)
	private String amount;
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getLeadsource() {
		return leadsource;
	}
	public void setLeadsource(String leadsource) {
		this.leadsource = leadsource;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
