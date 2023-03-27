package com.visa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visa.entity.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}
