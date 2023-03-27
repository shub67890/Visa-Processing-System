package com.visa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

@Data
@Builder
@Entity
public class Passanger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
private Integer id;
private String name;
private String Contant_No;
private Integer Age;
private String email;
private String visatype;
@JsonFormat(shape= JsonFormat.Shape.STRING, pattern ="dd-mm-yyy")
private Date Start_date;
@JsonFormat(shape= JsonFormat.Shape.STRING, pattern ="dd-mm-yyy")
private	Date Expiry_date;
private String gender;
private String Apply_country;
}
