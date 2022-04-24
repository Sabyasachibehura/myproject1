package com.sabyasachi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabyasachi.entity.Registration;
import com.sabyasachi.repositories.RegdRepo;

@Service
public class RegistrationImpl implements RegistrationService {
@Autowired
private RegdRepo regdRepo;

@Override
public void saveRegistration(Registration registration) {
    regdRepo.save(registration);
}

@Override
public List<Registration> getAllRegistraions() {
	List<Registration> findAll = regdRepo.findAll();
	return findAll;
}

@Override
public void deleteRegistrationById(int id) {
     regdRepo.deleteById(id);
}

@Override
public Registration updateRegistration(int id) {
   Optional<Registration> findById = regdRepo.findById(id);
   Registration registration = findById.get();
	return registration;
}


}
