/**
 * 
 */
package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.User;

/**
 * @author Naveen Kumawat
 *
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
