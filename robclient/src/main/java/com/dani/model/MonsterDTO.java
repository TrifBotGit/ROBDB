package com.dani.model;

import java.util.List;

import lombok.Data;

@Data
public class MonsterDTO {

	private String name;

	private String specie;

	private List<String> element = null;

	private List<String> ailments = null;

	private List<String> weakness = null;

	private String weaknessSign;

}
