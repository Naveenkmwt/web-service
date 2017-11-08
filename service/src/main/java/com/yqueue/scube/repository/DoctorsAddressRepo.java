/**
 * 
 */
package com.yqueue.scube.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.DoctorsAddress;

/**
 * @author Naveen Kumawat
 *
 */
@Repository
public interface DoctorsAddressRepo extends JpaRepository<DoctorsAddress, Long> {

	  @Query("select d.doctorsDetails from DoctorsAddress d where d.city=:city ")
	    public List<DoctorsAddress> findDoctorByCity(@Param("city") String city);
	  
	  @Query("select d from DoctorsAddress d where d.state=:state ")
	    public List<DoctorsAddress> findDoctorByState(@Param("state") String state);
	  
	  @Query("select d from DoctorsAddress d where d.pincode=:pincode ")
	    public List<DoctorsAddress> findDoctorByPinCode(@Param("pincode") String pincode);
	  
	  
	  
}
