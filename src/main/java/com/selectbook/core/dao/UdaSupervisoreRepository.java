package com.selectbook.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.selectbook.core.dto.UdaNotaio;
import com.selectbook.core.dto.UdaSupervisore;

public interface UdaSupervisoreRepository extends JpaRepository<UdaSupervisore, Long> {
	UdaSupervisore findById(long id);
	
	@Query("select n from UdaNotaio n where id = :id")
	UdaNotaio findUdaNotaioById(@Param("id") long id);
}
