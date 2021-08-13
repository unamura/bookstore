package com.selectbook.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.selectbook.core.dao.DocumentRepository;
import com.selectbook.core.dto.Document;

@RestController
public class StoreController {
	
	@Autowired
	DocumentRepository documentRepository;


	@RequestMapping("/trial")
	@ResponseBody
	public String trialPage() {
		return "Here we are";
	}

	@RequestMapping("/")
	public Document index() {
		Document doc = documentRepository.findById(2);
		//Document doc = new Document();
		//doc.getId();
		System.out.println("index: ...");
		/*String sqlin = "INSERT INTO users VALUES (4, 'John', 'Cusack');";

		int rows = jdbcTemplate.update(sqlin);
		if (rows > 0) {
			System.out.println("Row inserted");
		}*/

		return doc;
	}


}
