package com.selectbook.core.dto;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	@ManyToOne(optional=false) 
    @JoinColumn(name="id_run", nullable=false, updatable=false)
	private Run run;
}
