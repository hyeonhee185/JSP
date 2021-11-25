package com.spring.tiles;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/test.do")
	public String test() {
		return "test";
	}

	/*
	 * Tiles를 사용(header, left, footer 포함)
	 */
	@RequestMapping("/testPage.do")
	public String testPage() {
		return "test.page";
	}
	
	@RequestMapping("/testNo.do")
	public String testNo() {
		return "test.no";
	}
}
