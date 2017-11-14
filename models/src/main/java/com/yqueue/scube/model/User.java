/**
 * 
 */
package com.yqueue.scube.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @author Naveen Kumawat
 *
 */
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "username", nullable = true)
	private String username;
	@Transient
	private String phone;
	
	@OneToMany(mappedBy="user",fetch = FetchType.LAZY )
	private List<DailyAppointment>  dailyAppointmentList;
	
	@Lob
	@Column(name="userImage", nullable=true)
	private  byte[] userImage;
	
	@OneToOne
	private UserContactInfo userContactInfo;
	
	
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the dailyAppointmentList
	 */
	@JsonIgnore
	public List<DailyAppointment> getDailyAppointmentList() {
		return dailyAppointmentList;
	}
	/**
	 * @param dailyAppointmentList the dailyAppointmentList to set
	 */
	public void setDailyAppointmentList(List<DailyAppointment> dailyAppointmentList) {
		this.dailyAppointmentList = dailyAppointmentList;
	}
	/**
	 * @return the userImage
	 */
	public byte[] getUserImage() {
		return userImage;
	}
	/**
	 * @param userImage the userImage to set
	 */
	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}
	/**
	 * @return the userContactInfo
	 */
	public UserContactInfo getUserContactInfo() {
		return userContactInfo;
	}
	/**
	 * @param userContactInfo the userContactInfo to set
	 */
	public void setUserContactInfo(UserContactInfo userContactInfo) {
		this.userContactInfo = userContactInfo;
	}
	
	
	
	
}
