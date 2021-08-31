package com.selectbook.core.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="uda_notaio")
@Data
public class UdaNotaio {
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
	// Foreign key
	private Long id_doc_scartato;
	@OneToOne
	@JoinColumn(name = "id_uda")
	private Uda id_uda;

}
