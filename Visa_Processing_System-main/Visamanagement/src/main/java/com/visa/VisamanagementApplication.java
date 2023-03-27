package com.visa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.visa.entity.Passanger;
import com.visa.repository.PassangerRepository;

@SpringBootApplication
public class VisamanagementApplication implements CommandLineRunner {
@Autowired
	private PassangerRepository passangerRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(VisamanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Passanger P1 =new Passanger();
	P1.setName("Shubham");
	P1.setAge(18);
	P1.setContant_No("776898765");
	P1.setEmail("Skdash0098@gmail.com");
	P1.setVisatype("Tourist");
	P1.setStart_date(new Date(13-06-2019));
	P1.setExpiry_date(new Date(21-09-2019));
	P1.setGender("Male");
	P1.setApply_country("Los Angeles");
	
	passangerRepository.save(P1);
	}
	

}
