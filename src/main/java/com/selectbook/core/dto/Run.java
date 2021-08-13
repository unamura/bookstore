package com.selectbook.core.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Run {
	
	@Id
	private Integer id;
	private String stato;
	private String lavorazione;
	private String centro_competenza;
	private String ausiliario;
	private String ausiliario_ind;
	private String autore;
	private String centro_demat;
	private String codice_mida;
	private Timestamp data_scansione;
	private Timestamp data_importazione;
	private String tipo_demat;
	private String protocollo;
	private String z_cliente;
}
