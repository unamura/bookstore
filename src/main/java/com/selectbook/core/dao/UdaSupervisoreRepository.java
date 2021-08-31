package com.selectbook.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selectbook.core.dto.UdaSupervisore;

public interface UdaSupervisoreRepository extends JpaRepository<UdaSupervisore, Long> {
	UdaSupervisore findById(long id);
}
