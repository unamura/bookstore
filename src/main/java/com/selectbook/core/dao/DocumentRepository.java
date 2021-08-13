package com.selectbook.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selectbook.core.dto.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

	//List<DocumentEntity> findByVisionatoSupervisore(String visionatoSupervisore);
	
	Document findById(long id);
}
