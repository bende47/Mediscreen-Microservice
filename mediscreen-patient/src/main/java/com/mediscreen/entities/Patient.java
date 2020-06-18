package com.mediscreen.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patient implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String firstname;
	private String sex;
	@Temporal(TemporalType.DATE)
	private Date birthday;
	private String address;
	private String phone;
	private Date dateCreate;
	private Date dateUpdate;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the dateCreate
	 */
	public Date getDateCreate() {
		return dateCreate;
	}
	/**
	 * @param dateCreate the dateCreate to set
	 */
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	/**
	 * @return the dateUpdate
	 */
	public Date getDateUpdate() {
		return dateUpdate;
	}
	/**
	 * @param dateUpdate the dateUpdate to set
	 */
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	/**
	 * 
	 */
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param firstname
	 * @param sex
	 * @param birthday
	 * @param address
	 * @param phone
	 */
	public Patient(String name, String firstname, String sex, Date birthday, String address, String phone) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", firstname=" + firstname + ", sex=" + sex + ", birthday="
				+ birthday + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
}
