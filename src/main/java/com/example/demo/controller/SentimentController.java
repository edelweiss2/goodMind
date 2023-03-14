package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.SentimentUtil;

@Controller
@RequestMapping("/goodM/sentiment")
public class SentimentController {
	
	@Autowired private SentimentUtil sentimentUtil;

	@GetMapping("/sentiment")
	public String sentimentForm() {
		return "sentiment/sentimentForm";
	}
	
	@PostMapping("/sentiment")
	public String sentiment(String content, Model model) throws Exception {
		String result = sentimentUtil.getSentimentResult(content.replace("\n", " ").replace("\r", ""));
		model.addAttribute("content", content.replace("\n", "<br>").replace("\r", ""));
		model.addAttribute("result", result);
		return "sentiment/sentimentResult";
	}
}