package com.selectbook.core.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="uda_supervisore")
@Data
public class UdaSupervisore {
	@Id
	private Long id;
	private String stato;
	private String id_utente;
	private Timestamp data_inserimento;
	private Timestamp data_presa_in_carico;
	private Timestamp data_completamento;
	private Boolean scartato;
	private String motivo_scarto;
	private Timestamp firma;
	//FK
	private Long id_doc_scartato;
	//FK
	private Long id_uda;
}
