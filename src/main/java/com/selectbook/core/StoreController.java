package com.selectbook.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.jdbc.core.RowMapper;

@Controller
public class StoreController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/trial")
	@ResponseBody
	public String trialPage() {
		return "Here we are";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		System.out.println("index: ...");
		String sqlin = "INSERT INTO users VALUES (4, 'John', 'Cusack');";

		int rows = jdbcTemplate.update(sqlin);
		if (rows > 0) {
			System.out.println("Row inserted");
		}

		return "welcomw";
	}

}
