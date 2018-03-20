package com.dani.app.dto;

import java.util.List;

import lombok.Data;

@Data
public class MonsterDTO {

	private Long id;
	private String name;
	private String specie;
	private List<String> elements;
	private List<String> ailments;
	private List<String> weaknesses;
	private String weaknessSign;

}
