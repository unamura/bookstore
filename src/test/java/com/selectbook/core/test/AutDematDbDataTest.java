package com.selectbook.core.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.selectbook.core.dao.DocumentRepository;
import com.selectbook.core.dao.UdaSupervisoreRepository;
import com.selectbook.core.dto.Document;
import com.selectbook.core.dto.Run;
import com.selectbook.core.dto.Uda;
import com.selectbook.core.dto.UdaNotaio;
import com.selectbook.core.dto.UdaSupervisore;

@SpringBootTest
public class AutDematDbDataTest {

	@Autowired
	DocumentRepository documentRepository;
	
	@Autowired
	UdaSupervisoreRepository udaSupervisoreRepository;
	
	@Test
	public void getDocumentTable() {
		Document documentTable = documentRepository.findById(2);
		assertNotNull(documentTable);
		assertNotNull(documentTable.getId());
		assertNotNull(documentTable.getVisionato_supervisore());
		assertNotNull(documentTable.getVisionato_notaio());
		assertNotNull(documentTable.getDescrizione());
		assertNull(documentTable.getNome_file());
		assertNotNull(documentTable.getDeletion_date());
		assertNotNull(documentTable.getLogical_deleted());
		assertNotNull(documentTable.getHash_documento());
		assertNotNull(documentTable.getS3_uri());
		assertNull(documentTable.getS3_arn());
		assertNotNull(documentTable.getIndice_1());
		assertNotNull(documentTable.getIndice_2());
		assertNotNull(documentTable.getIndice_3());
		assertNotNull(documentTable.getIndice_4());
		assertNotNull(documentTable.getIndice_5());
		assertNotNull(documentTable.getNum_pagine());
		assertNotNull(documentTable.getTipo_documento());
		assertNotNull(documentTable.getUda());
		Uda udaTable = documentTable.getUda();
		assertNotNull(udaTable.getId());
		assertNotNull(udaTable.getStato());
		assertNotNull(udaTable.getIs_campione_supervisore());
		assertNotNull(udaTable.getIs_campione_notaio());
		assertNotNull(udaTable.getData_campionatura());
		assertNotNull(udaTable.getProg_campione());
		assertNotNull(udaTable.getData_indicizzazione());
		assertNotNull(udaTable.getScatola());
		assertNotNull(udaTable.getRun());
		Run runTable = udaTable.getRun();
		assertNotNull(runTable.getId());
		assertNotNull(runTable.getStato());
		assertNotNull(runTable.getLavorazione());
		assertNotNull(runTable.getCentro_competenza());
		assertNotNull(runTable.getAusiliario());
		assertNotNull(runTable.getAusiliario_ind());
		assertNotNull(runTable.getAutore());
		assertNotNull(runTable.getCentro_demat());
		assertNotNull(runTable.getCodice_mida());
		assertNotNull(runTable.getData_scansione());
		assertNotNull(runTable.getData_importazione());
		assertNotNull(runTable.getTipo_demat());
		assertNotNull(runTable.getProtocollo());
		assertNotNull(runTable.getZ_cliente());
	}
	
	@Test
	public void getUdaSupervisore() {
		UdaSupervisore udaSuper = udaSupervisoreRepository.findById(2);
		assertNotNull(udaSuper);
		assertNotNull(udaSuper.getId());
		assertNotNull(udaSuper.getStato());
		assertNull(udaSuper.getId_utente());
		assertNotNull(udaSuper.getData_inserimento());
		assertNull(udaSuper.getData_presa_in_carico());
		assertNull(udaSuper.getData_completamento());
		assertNull(udaSuper.getScartato());
		assertNull(udaSuper.getMotivo_scarto());
		assertNull(udaSuper.getFirma());
		assertNull(udaSuper.getId_doc_scartato());
		Uda udaTable = udaSuper.getId_uda();
		assertNotNull(udaTable);
		assertNotNull(udaTable.getId());
		assertNotNull(udaTable.getStato());
		assertNotNull(udaTable.getIs_campione_supervisore());
		assertNotNull(udaTable.getIs_campione_notaio());
		assertNotNull(udaTable.getData_campionatura());
		assertNotNull(udaTable.getProg_campione());
		assertNotNull(udaTable.getData_indicizzazione());
		assertNotNull(udaTable.getScatola());
		assertNotNull(udaTable.getRun());
		Run runTable = udaTable.getRun();
		assertNotNull(runTable.getId());
		assertNotNull(runTable.getStato());
		assertNotNull(runTable.getLavorazione());
		assertNotNull(runTable.getCentro_competenza());
		assertNotNull(runTable.getAusiliario());
		assertNotNull(runTable.getAusiliario_ind());
		assertNotNull(runTable.getAutore());
		assertNotNull(runTable.getCentro_demat());
		assertNotNull(runTable.getCodice_mida());
		assertNotNull(runTable.getData_scansione());
		assertNotNull(runTable.getData_importazione());
		assertNotNull(runTable.getTipo_demat());
		assertNotNull(runTable.getProtocollo());
		assertNotNull(runTable.getZ_cliente());
	}
	
	@Test
	public void getUdaNotaio() {
		UdaNotaio udaNotaio = udaSupervisoreRepository.findUdaNotaioById(2);
		assertNotNull(udaNotaio);
		assertNotNull(udaNotaio.getId());
		assertNotNull(udaNotaio.getStato());
		assertNull(udaNotaio.getId_utente());
		assertNotNull(udaNotaio.getData_inserimento());
		assertNull(udaNotaio.getData_presa_in_carico());
		assertNull(udaNotaio.getData_completamento());
		assertNull(udaNotaio.getScartato());
		assertNull(udaNotaio.getMotivo_scarto());
		assertNull(udaNotaio.getFirma());
		assertNull(udaNotaio.getId_doc_scartato());
		Uda udaTable = udaNotaio.getId_uda();
		assertNotNull(udaTable);
		assertNotNull(udaTable.getId());
		assertNotNull(udaTable.getStato());
		assertNotNull(udaTable.getIs_campione_supervisore());
		assertNotNull(udaTable.getIs_campione_notaio());
		assertNotNull(udaTable.getData_campionatura());
		assertNotNull(udaTable.getProg_campione());
		assertNotNull(udaTable.getData_indicizzazione());
		assertNotNull(udaTable.getScatola());
		assertNotNull(udaTable.getRun());
		Run runTable = udaTable.getRun();
		assertNotNull(runTable.getId());
		assertNotNull(runTable.getStato());
		assertNotNull(runTable.getLavorazione());
		assertNotNull(runTable.getCentro_competenza());
		assertNotNull(runTable.getAusiliario());
		assertNotNull(runTable.getAusiliario_ind());
		assertNotNull(runTable.getAutore());
		assertNotNull(runTable.getCentro_demat());
		assertNotNull(runTable.getCodice_mida());
		assertNotNull(runTable.getData_scansione());
		assertNotNull(runTable.getData_importazione());
		assertNotNull(runTable.getTipo_demat());
		assertNotNull(runTable.getProtocollo());
		assertNotNull(runTable.getZ_cliente());
	}
}
