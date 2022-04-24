package com.sabyasachi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sabyasachi.entity.Registration;
import com.sabyasachi.repositories.RegdRepo;

@RestController
public class RegistrationRestController {
@Autowired
private RegdRepo regdRepo;

@RequestMapping("/getRegistration/{id}")
public Registration getAllRegd(@PathVariable("id") int id){
	Optional<Registration> findById = regdRepo.findById(id);
	Registration registration = findById.get();
	return registration;
}
}
