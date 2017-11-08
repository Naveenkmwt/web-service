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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Naveen Kumawat
 *
 */
@Entity
@Table(name = "Doctors_Address")
@XmlRootElement
public class DoctorsAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "fullAddress", nullable = false)
	private String fullAddress;

	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "state", nullable = false)
	private String state;
	@Column(name = "pincode", nullable = false)
	private String pincode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctorsDetailsId")
	private DoctorsDetails doctorsDetails;
	
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
	 * @return the fullAddress
	 */
	public String getFullAddress() {
		return fullAddress;
	}
	/**
	 * @param fullAddress the fullAddress to set
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the doctorsDetails
	 */
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
