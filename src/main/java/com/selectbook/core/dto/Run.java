package com.selectbook.core.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Run")
@Table(name = "run")
@Data
public class Run {
	
	@Id
	private Integer id;
	//@OneToMany
	//private Set<Uda> uda;
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
