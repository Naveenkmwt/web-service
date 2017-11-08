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
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@OneToMany(mappedBy="user",fetch = FetchType.LAZY )
	private List<DailyAppointment>  dailyAppointmentList;
	
	
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
	public List<DailyAppointment> getDailyAppointmentList() {
		return dailyAppointmentList;
	}
	/**
	 * @param dailyAppointmentList the dailyAppointmentList to set
	 */
	public void setDailyAppointmentList(List<DailyAppointment> dailyAppointmentList) {
		this.dailyAppointmentList = dailyAppointmentList;
	}
	
	
	
	
}
