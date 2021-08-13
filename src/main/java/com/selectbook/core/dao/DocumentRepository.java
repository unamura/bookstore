package com.selectbook.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selectbook.core.dto.DocumentEntity;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {

	//List<DocumentEntity> findByVisionatoSupervisore(String visionatoSupervisore);
	
	DocumentEntity findById(long id);
}
