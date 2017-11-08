package com.yqueue.scube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yqueue.scube.model.DoctorsDetails;

@Repository
public interface DoctorsDetailsRepo extends JpaRepository<DoctorsDetails, Long> {
    
    
}
