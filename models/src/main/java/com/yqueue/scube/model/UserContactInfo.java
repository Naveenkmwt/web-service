/**
 * 
 */
package com.yqueue.scube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Naveen Kumawat
 *
 */
@Table(name="UserContactInfo")
@Entity
public class UserContactInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "userPhoneNo")
	private long userPhoneNo;
	
	@OneToOne(mappedBy="userContactInfo")
	public User user;

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
	 * @return the userPhoneNo
	 */
	public long getUserPhoneNo() {
		return userPhoneNo;
	}

	/**
	 * @param userPhoneNo the userPhoneNo to set
	 */
	public void setUserPhoneNo(long userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
