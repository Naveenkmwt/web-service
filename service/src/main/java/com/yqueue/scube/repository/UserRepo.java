/**
 * 
 */
package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.User;

/**
 * @author Naveen Kumawat
 *
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	@Query("select u from User u where u.userContactInfo.userPhoneNo=:phoneNo")
	public User findUserByPhoneNo(@Param("phoneNo") Long phoneNo);
}
