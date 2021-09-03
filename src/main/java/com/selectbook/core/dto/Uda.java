package com.selectbook.core.dto;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "uda")
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
	//private Run getRun() {return run;}
	/*
	@OneToMany(mappedBy = "uda")
	private List<Document> documentList = new ArrayList<Document>();
	*/
	//@OneToOne(mappedBy = "id_uda")
	//private UdaNotaio udaNotaio;
}
