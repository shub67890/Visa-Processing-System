package com.visa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.entity.Passanger;
import com.visa.repository.PassangerRepository;
import com.visa.service.PassangerService;
@Service
public class PassangerServiceImpl implements PassangerService {
@Autowired
	private PassangerRepository passangerRepository;
	@Override
	public Passanger newPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return  passangerRepository.save(passanger);
	}

	@Override
	public List<Passanger> getAllPsss() {
		// TODO Auto-generated method stub
		return passangerRepository.findAll();
	}

	@Override
	public Passanger getById(int id) {
		// TODO Auto-generated method stub
		return passangerRepository.findById(id).get();
	}

	@Override
	public Passanger updatePass(int id, Passanger passanger) {
		// TODO Auto-generated method stub
		Passanger _Passanger=passangerRepository.findById(id).get();
		_Passanger.setName(passanger.getName());
		_Passanger.setAge(passanger.getAge());
		_Passanger.setContant_No(passanger.getContant_No());
		_Passanger.setEmail(passanger.getEmail());
		_Passanger.setVisatype(passanger.getVisatype());
		_Passanger.setStart_date(passanger.getStart_date());
		_Passanger.setExpiry_date(passanger.getExpiry_date());
		_Passanger.setGender(passanger.getGender());
		_Passanger.setApply_country(passanger.getApply_country());
		return passangerRepository.save(_Passanger);
		
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		passangerRepository.deleteById(id);
		return "Deleted Successfully";
	}

}
