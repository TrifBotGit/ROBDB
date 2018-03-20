package com.dani.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dani.app.dto.MonsterDTO;
import com.dani.app.service.MonsterService;

@RestController
@RequestMapping("/monster")
public class MonsterController {
	
	@Autowired
	private MonsterService service;

	@ResponseBody
	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public MonsterDTO getByName(@PathVariable("name") String name){
		return service.findByName(name);
	}
	
}
