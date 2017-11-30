/**
 * 
 */
package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqueue.scube.model.DailyAppointment;

/**
 * @author Naveen Kumawat
 *
 */
public interface DailyAppointmentRepo extends JpaRepository<DailyAppointment, Long> {

	
	
}
