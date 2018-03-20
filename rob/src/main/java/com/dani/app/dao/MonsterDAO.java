package com.dani.app.dao;

import com.dani.app.model.Monster;

public interface MonsterDAO {

	Monster getByName(String name);
	
}
