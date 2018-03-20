package com.dani.app.service;

import com.dani.app.dto.MonsterDTO;

public interface MonsterService {

	MonsterDTO findByName(String name);

	MonsterDTO insert(MonsterDTO monster);

	MonsterDTO update(MonsterDTO monster);

}
