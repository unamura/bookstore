package com.selectbook.core.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Uda {
	@Id
	private Long id;
	private String stato;
	private Boolean is_campione_supervisore;
	private Boolean is_campione_notaio;
	private Timestamp data_campionatura;
	private String prog_campione;
	private Timestamp data_indicizzazione;
	private String scatola;
	//Foreign key
	private Long id_run;

}
