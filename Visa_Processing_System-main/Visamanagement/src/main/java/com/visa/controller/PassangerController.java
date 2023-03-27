package com.visa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.entity.Passanger;
import com.visa.service.PassangerService;

@RestController
public class PassangerController {
@Autowired
	private PassangerService passangerService;
@PostMapping(value="/add")
public Passanger addPassanger(@RequestBody Passanger passanger) {
	return passangerService.newPassanger(passanger);
	
}
@GetMapping(value="/getall")
public List<Passanger> getAllPss(){
	return passangerService.getAllPsss();
}
@GetMapping(value="/Byid/{id}")
public Passanger getPassangerById(@PathVariable int id){
	return passangerService.getById(id);
}
@PutMapping(value="/update/{id}")
public Passanger updatePasss(@PathVariable int id,@RequestBody Passanger Passanger){
	return passangerService.updatePass(id, Passanger);
}
@DeleteMapping(value="/delete/{id}")
public String removeById(@PathVariable int id) {
	
	passangerService.deleteById(id);
	return "Deleted successfully";
}

}
