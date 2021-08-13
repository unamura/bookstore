package com.selectbook.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.selectbook.dto.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {

	List<Document> findByVisionatoSupervisore(String visionatoSupervisore);
	
	Document findById(long id);
}
