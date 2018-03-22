package com.dani.app.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dani.app.dto.MonsterDTO;

import lombok.Data;

@Entity
@Data
@Table(name = "MONSTER")
public class Monster {
	@Id
	private Long id;
	private String name;
	private String specie;
	@ElementCollection
	private List<String> elements;
	@ElementCollection
	private List<String> ailments;
	@ElementCollection
	private List<String> weaknesses;
	private String weaknessSign;

	public MonsterDTO toDto(String... options) {
		MonsterDTO dto = new MonsterDTO();
		dto.setId(this.id);
		dto.setName(this.name);
		dto.setSpecie(this.specie);
		dto.setElements(this.elements);
		dto.setAilments(this.ailments);
		dto.setWeaknesses(this.weaknesses);
		dto.setWeaknessSign(this.weaknessSign);
		return dto;
	}

	public void fromDto(MonsterDTO dto) {
		this.setId(dto.getId());
		this.setName(dto.getName());
		this.setSpecie(dto.getSpecie());
		this.setElements(dto.getElements());
		this.setAilments(dto.getAilments());
		this.setWeaknesses(dto.getWeaknesses());
		this.setWeaknessSign(dto.getWeaknessSign());
	}
}
