/**
 * 
 */
package com.yqueue.scube.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Naveen Kumawat
 *
 */
@Entity
@Table(name = "Doctor_Details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DoctorsDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "doct_name", nullable = false)
	private String doct_name;

	@Column(name = "doct_qualification", nullable = false)
	private String doct_qualification;

	@Column(name = "doct_specialization", nullable = false)
	private String doct_specialization;

	@Column(name = "doct_experience", nullable = false)
	private String doct_experience;

	@OneToMany(mappedBy="doctorsDetails", fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private List<DoctorsAddress> doctorsAddressList;
	
	@OneToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "contactNo", nullable = false)
	private	ContactInfo contactInfo;
	
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the doct_name
	 */
	public String getDoct_name() {
		return doct_name;
	}

	/**
	 * @param doct_name the doct_name to set
	 */
	public void setDoct_name(String doct_name) {
		this.doct_name = doct_name;
	}

	/**
	 * @return the doct_qualification
	 */
	public String getDoct_qualification() {
		return doct_qualification;
	}

	/**
	 * @param doct_qualification the doct_qualification to set
	 */
	public void setDoct_qualification(String doct_qualification) {
		this.doct_qualification = doct_qualification;
	}

	/**
	 * @return the doct_specialization
	 */
	public String getDoct_specialization() {
		return doct_specialization;
	}

	/**
	 * @param doct_specialization the doct_specialization to set
	 */
	public void setDoct_specialization(String doct_specialization) {
		this.doct_specialization = doct_specialization;
	}

	/**
	 * @return the doct_experience
	 */
	public String getDoct_experience() {
		return doct_experience;
	}

	/**
	 * @param doct_experience the doct_experience to set
	 */
	public void setDoct_experience(String doct_experience) {
		this.doct_experience = doct_experience;
	}

	/**
	 * @return the doctorsAddressList
	 */
	@JsonIgnore
	public List<DoctorsAddress> getDoctorsAddressList() {
		return doctorsAddressList;
	}

	/**
	 * @param doctorsAddressList the doctorsAddressList to set
	 */
	@JsonProperty
	public void setDoctorsAddressList(List<DoctorsAddress> doctorsAddressList) {
		this.doctorsAddressList = doctorsAddressList;
	}
	


	/**
	 * @return the contactInfo
	 */
	@JsonIgnore
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	@JsonIgnore
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	
	
	
	
	
	
}
