package com.franchiseapplication.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicantDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@Column(name = "id_number")
	private String idNumber;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	private String address;
	
	private String phone;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "previous_experience")
	private String previousExperience;
	
	@Column(name = "interest_in_brand")
	private String interestInBrand;
	
	@Column(name = "investment_amount")
	private String investmentAmount;
	
	@Column(name = "preffered_geographical_area")
	private String prefferedGeographicalArea;
	
	@Column(name = "additional_notes")
	private String additionalNotes;
	
	@Column(name = "time_created")
	private Calendar timeCreated;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPreviousExperience() {
		return previousExperience;
	}

	public void setPreviousExperience(String previousExperience) {
		this.previousExperience = previousExperience;
	}

	public String getInterestInBrand() {
		return interestInBrand;
	}

	public void setInterestInBrand(String interestInBrand) {
		this.interestInBrand = interestInBrand;
	}

	public String getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(String investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public String getPrefferedGeographicalArea() {
		return prefferedGeographicalArea;
	}

	public void setPrefferedGeographicalArea(String prefferedGeographicalArea) {
		this.prefferedGeographicalArea = prefferedGeographicalArea;
	}

	public String getAdditionalNotes() {
		return additionalNotes;
	}

	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}

	public Calendar getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Calendar timeCreated) {
		this.timeCreated = timeCreated;
	}
}
