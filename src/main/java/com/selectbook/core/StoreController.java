package com.selectbook.core;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selectbook.core.dao.DocumentRepository;
import com.selectbook.core.dao.UdaSupervisoreRepository;
import com.selectbook.core.dto.Document;
import com.selectbook.core.dto.Run;
import com.selectbook.core.dto.UdaNotaio;
import com.selectbook.core.dto.UdaSupervisore;

@RestController
public class StoreController {

	@Autowired
	DocumentRepository documentRepository;

	@Resource
	UdaSupervisoreRepository udaSupervisoreRepository;
	
	@Resource
	UdaSupervisoreRepository udaNotaioRepository;

	@RequestMapping("/trial")
	public String trialPage() {
		return "Here we are";
	}

	@RequestMapping("/document/id")
	public Document index() {
		Document doc = documentRepository.findById(2);

		System.out.println("document/id");

		return doc;
	}
	
	@RequestMapping("/document/id/fields")
	public String getDocumentFields() {
		Document doc = documentRepository.findById(2);

		System.out.println("document/id/fields");

		return "Document table: " + doc.getId() + ", " + doc.getDescrizione();
	}

	@RequestMapping("/document/iduda")
	public List<Document> documentIdUda() {
		List<Document> listDocument = documentRepository.findByUda(796);

		System.out.println("document/iduda");
		return listDocument;
	}

	@RequestMapping("document/id/{documentId}")
	public Document getDocumentByIdUri(@PathVariable long documentId) {
		Document doc = documentRepository.findById(documentId);

		System.out.println("document/id/" + documentId);
		return doc;
	}

	@RequestMapping("/run/autore")
	public List<Run> runByAuthor() {
		List<Run> listRun = documentRepository.findRunByAutore("autore");
		System.out.println("/run/autore");
		return listRun;
	}

	@RequestMapping("/supervisore")
	public UdaSupervisore retrieveUdaSupervisore() {
		UdaSupervisore udaSupervisoreFromId = udaSupervisoreRepository.findById(2);

		System.out.println("/supervisore");
		return udaSupervisoreFromId;
	}

	@RequestMapping("/notaio/{notaioId}")
	public UdaNotaio retrieveUdaNotaio(@PathVariable long notaioId) {
		UdaNotaio udaNotaioFromId = udaNotaioRepository.findUdaNotaioById(notaioId);
		
		System.out.println("/notaio/" + notaioId);
		return udaNotaioFromId;
	}

}
