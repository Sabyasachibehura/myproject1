package com.sabyasachi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sabyasachi.dto.UpdateRegistrations;
import com.sabyasachi.entity.Registration;
import com.sabyasachi.service.RegistrationService;

@Controller

public class RegistrationController {
    
	@Autowired
	private RegistrationService registrationService;
	@RequestMapping("/newRegistration")
	public String showLocationPage() {
		return "NewRegistrations";
	}
	@RequestMapping("/saveRegistrations")
	public String saveLocations(@ModelAttribute("registrations") Registration registrations, ModelMap modelMap) {
		registrationService.saveRegistration(registrations);
		modelMap.addAttribute("msg", "Record is saved!");
		return "NewRegistrations";	
		}
	@RequestMapping("/getAllRegd")
	public String getAllRegd(ModelMap modelMap) {
		List<Registration> allRegistraions = registrationService.getAllRegistraions();
		modelMap.addAttribute("registrations",allRegistraions);
		return "displayAllRegistrations";
	}
	@RequestMapping("/deleteRegistrations")
	public String deleteRegostrations(@RequestParam("id") int id,ModelMap modelMap) {
		registrationService.deleteRegistrationById(id);
		List<Registration> allRegistraions = registrationService.getAllRegistraions();
		modelMap.addAttribute("registrations",allRegistraions);
		return "displayAllRegistrations";	
		}
	@RequestMapping("/updateAllRegistrations")
	public String updateAllLocations(@RequestParam("id") int id,ModelMap modelMap) {
		Registration updateRegistration = registrationService.updateRegistration(id);
	    modelMap.addAttribute("registration", updateRegistration);
		return "updateRegistrationInfo";
	}
	
	@RequestMapping("/updateRegi")
	public String updateRegd(UpdateRegistrations updateRegistration,ModelMap modelMap) {
		Registration registration=new Registration();
		registration.setId(updateRegistration.getId());
		registration.setEmail(updateRegistration.getEmail());
		registration.setName(updateRegistration.getName());
        
		registrationService.saveRegistration(registration);
		
		List<Registration> allRegistraions = registrationService.getAllRegistraions();
		modelMap.addAttribute("registrations",allRegistraions);
		return "displayAllRegistrations";
	}
}
