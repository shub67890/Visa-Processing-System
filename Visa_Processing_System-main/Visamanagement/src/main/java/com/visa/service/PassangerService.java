package com.visa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.visa.entity.Passanger;
@Component
public interface PassangerService {
	public Passanger newPassanger(Passanger passanger);
	public List<Passanger> getAllPsss();
	public Passanger getById(int id);
	public Passanger updatePass(int id, Passanger Passanger);
	public String deleteById(int id);
}

