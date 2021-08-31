package com.selectbook.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.selectbook.core.dto.Document;
import com.selectbook.core.dto.Run;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

	@Query("select u from Document u where u.uda.id = ?1")
	List<Document> findByUda(long pag);
	
	Document findById(long id);
	
	@Query("select u from Run u where u.autore = ?1")
	List<Run> findRunByAutore(String autore);
	
}