/**
 * 
 */
package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.UserContactInfo;

/**
 * @author Naveen Kumawat
 *
 */
@Repository
public interface UserContactInfoRepo extends JpaRepository<UserContactInfo, Long> {

//	@Query("select c from UserContactInfo c where c.userPhoneNo =:phone") 
//	public UserContactInfo findContactNumber(@Param("phone") String phone);
//	
}
