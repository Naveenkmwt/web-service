package com.yqueue.scube.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yqueue.scube.model.ContactInfo;
import com.yqueue.scube.model.DoctorsAddress;
import com.yqueue.scube.model.DoctorsDetails;
import com.yqueue.scube.model.User;


@Component
public interface UserDbService {
    void save(DoctorsDetails doctorsDetails);
    
    public List<DoctorsDetails> getAllDoctors();
    
    public List<DoctorsAddress> getAllDoctorsAddress();
    
    public DoctorsDetails getDoctor(long id);
    
    public void saveDoctor(DoctorsDetails doctorsDetails);
    
    public List<DoctorsAddress> findDoctorByCity(String city);
    
    public List<DoctorsAddress> findDoctorByState(String state);
    
    public List<DoctorsAddress> findDoctorByPinCode(String pincode);
    
	public DoctorsDetails findDoctorByPhone( String phoneNo);
	
	public void saveUser (User user);
	
	public void saveContact(ContactInfo contactInfo);
	
	public ContactInfo findByPhoneNo(String phone);
	
	



    
    

 
}
