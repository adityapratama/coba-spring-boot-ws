package com.aditya.pra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.pra.domain.Message;

@RestController
public class MessageController {
	
	@RequestMapping(value="message",method=RequestMethod.GET)
	public Message getMessage(){
		Message m = new Message();
		m.setId(1);
		m.setContent("Hello, world!");
		
		return m;
	}
}
