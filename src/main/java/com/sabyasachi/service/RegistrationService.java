package com.sabyasachi.service;

import java.util.List;

import com.sabyasachi.entity.Registration;

public interface RegistrationService {
public void saveRegistration(Registration registration);
public List<Registration> getAllRegistraions();
public void deleteRegistrationById(int id);
public Registration updateRegistration(int id);
	

}
