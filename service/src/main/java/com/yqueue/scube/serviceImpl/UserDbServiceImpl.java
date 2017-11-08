/**
 * 
 */
package com.yqueue.scube.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.yqueue.scube.model.ContactInfo;
import com.yqueue.scube.model.DoctorsAddress;
import com.yqueue.scube.model.DoctorsDetails;
import com.yqueue.scube.model.User;
import com.yqueue.scube.repository.DoctorsAddressRepo;
import com.yqueue.scube.repository.DoctorsContactRepo;
import com.yqueue.scube.repository.DoctorsDetailsRepo;
import com.yqueue.scube.repository.UserRepo;
import com.yqueue.scube.service.UserDbService;

/**
 * @author Naveen Kumawat
 *
 */

@Component
@Qualifier("userDbService")
public class UserDbServiceImpl implements UserDbService{

	@Autowired
	private DoctorsDetailsRepo doctorsDetailsRepo;
	@Autowired
	private DoctorsAddressRepo doctorAddressRepo;
	
	@Autowired
	private DoctorsContactRepo doctorsContactRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void save(DoctorsDetails doctorsDetails) {

		doctorsDetailsRepo.save(doctorsDetails);
	}
	
	@Override
	@Transactional
	public List<DoctorsDetails> getAllDoctors() {

	return doctorsDetailsRepo.findAll();

	}

	@Override
	@Transactional
	public List<DoctorsAddress> getAllDoctorsAddress() {
		// TODO Auto-generated method stub
		return doctorAddressRepo.findAll();
	} 

	@Override
	@Transactional
	public DoctorsDetails getDoctor(long id) {
		return doctorsDetailsRepo.findOne(id);
	}

	@Override
	public void saveDoctor(DoctorsDetails doctorsDetails) {
		
		List<DoctorsAddress> doctorAddresslist = doctorsDetails.getDoctorsAddressList();
		// fetch list of doctors address and save in data base with doctor id
		
		for (DoctorsAddress doctorsAddress : doctorAddresslist) {
			doctorsAddress.setDoctorsDetails(doctorsDetails);
			doctorsDetails.setDoctorsAddressList(doctorAddresslist);
		}
		//fetch list of doctors phone number and save in data base with doctor id
		ContactInfo contactInfo = doctorsDetails.getContactInfo();
		
		doctorsContactRepo.save(contactInfo);
		doctorsDetails.setContactInfo(contactInfo);

		doctorsDetailsRepo.save(doctorsDetails);

		
		
		}

		
	

	@Override
	@Transactional
	public List<DoctorsAddress> findDoctorByCity(String city) {
		
		return doctorAddressRepo.findDoctorByCity(city);
	}

	@Override
	public List<DoctorsAddress> findDoctorByState(String state) {

		return doctorAddressRepo.findDoctorByState(state);
	}

	@Override
	public List<DoctorsAddress> findDoctorByPinCode(String pincode) {
		
		return doctorAddressRepo.findDoctorByPinCode(pincode);
	}

	@Override
	public DoctorsDetails findDoctorByPhone(String phoneNo) {
		
		return doctorsContactRepo.findDoctorByPhone(phoneNo);
	}

	@Override
	public void saveUser(User user) {
		
		userRepo.save(user);
	}

	@Override
	public void saveContact(ContactInfo contactInfo) {
		doctorsContactRepo.save(contactInfo);
	}

	@Override
	public ContactInfo findByPhoneNo(String phone) {
		return doctorsContactRepo.findByPhoneNo(phone);
	}

  


}
