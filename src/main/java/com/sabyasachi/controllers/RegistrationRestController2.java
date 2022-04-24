package com.sabyasachi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabyasachi.entity.Registration;
import com.sabyasachi.repositories.RegdRepo;

@RestController
@RequestMapping("/getRegistrations")
public class RegistrationRestController2 {
@Autowired
private RegdRepo regdRepo;

@GetMapping
public List<Registration> getRegistrations() {
	List<Registration> registrations = regdRepo.findAll();
	return  registrations;
}
@PostMapping
public void saveRegistration(@RequestBody Registration registration) {
	regdRepo.save(registration);
}

@PutMapping
public void updateRegistrations(@RequestBody Registration registration) {
	regdRepo.save(registration);
}
@DeleteMapping("/deleRegd/{id}")
public void deleRegistrations(@PathVariable("id") int id) {
	regdRepo.deleteById(id);
}






}
