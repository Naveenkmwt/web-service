/**
 * 
 */
package com.yqueue.scube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Naveen Kumawat
 *
 */
@Entity
@Table(name = "DoctorsContactInfo")
@XmlRootElement
public class ContactInfo {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "phoneNo", nullable = false)
	private String phoneNo;
	
	@OneToOne(mappedBy="contactInfo",fetch=FetchType.LAZY)
	private DoctorsDetails doctorsDetails;
	
	
	/**
	 * 
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
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the doctorsDetails
	 */
	@JsonProperty
	public DoctorsDetails getDoctorsDetails() {
		return doctorsDetails;
	}

	/**
	 * @param doctorsDetails the doctorsDetails to set
	 */
	public void setDoctorsDetails(DoctorsDetails doctorsDetails) {
		this.doctorsDetails = doctorsDetails;
	}




	
	
}
