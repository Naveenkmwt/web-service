/**
 * 
 */
package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.ContactInfo;
import com.yqueue.scube.model.DoctorsDetails;

/**
 * @author Naveen Kumawat
 *
 */
@Repository
public interface DoctorsContactRepo extends JpaRepository<ContactInfo, Long> {
	
	@Query("select d.doctorsDetails from ContactInfo d where d.phoneNo=:phoneNo ")
	public DoctorsDetails findDoctorByPhone(@Param("phoneNo") String phoneNo);
	
	@Query("select p from ContactInfo p where p.phoneNo=:phoneNo")
	public ContactInfo findByPhoneNo(@Param("phoneNo")String phoneNo);
}
