package com.dani.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dani.app.dao.MonsterDAO;
import com.dani.app.dto.MonsterDTO;
import com.dani.app.model.Monster;
import com.dani.app.service.MonsterService;

@Service
public class MonsterServiceImpl implements MonsterService{
	
	@Autowired
	private MonsterDAO dao;

	@Override
	public MonsterDTO findByName(String name) {
		Monster monster = dao.getByName(name);
		return monster.toDto();
	}

	@Override
	public MonsterDTO insert(MonsterDTO monster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MonsterDTO update(MonsterDTO monster) {
		// TODO Auto-generated method stub
		return null;
	}

}
