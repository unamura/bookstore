package com.selectbook.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Document {
	
	@Id
	private Long id;
	private Boolean visionato_supervisore;
	private Boolean visionato_notaio;
	private String descrizione;
	private String nome_file;
	private Timestamp deletion_date;
	private Boolean logical_deleted;
	private String hash_documento;
	private String s3_uri;
	private String s3_arn;
	private String indice_1;
	private String indice_2;
	private String indice_3;
	private String indice_4;
	private String indice_5;
	private Integer num_pagine;
	private String tipo_documento;
 	private Long id_uda;
	

}
