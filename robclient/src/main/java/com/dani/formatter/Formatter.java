package com.dani.formatter;

import com.dani.model.MonsterDTO;

public class Formatter {
	
	public String buildMonsterResponse(MonsterDTO monster){
		String response = "";
		response += monster.getName() + System.lineSeparator()
				 + monster.getSpecie() + System.lineSeparator()
				 + monster.getWeaknessSign() + System.lineSeparator();
		if(monster.getElement()!=null&&!monster.getElement().isEmpty()){
			for (String element : monster.getElement()) {
				response += element + " ";
			}
			response += System.lineSeparator();
		}
		if(monster.getAilments()!=null&&!monster.getAilments().isEmpty()){
			for (String ailment : monster.getAilments()) {
				response += ailment + " ";
			}
			response += System.lineSeparator();
		}
		if(monster.getWeakness()!=null&&!monster.getWeakness().isEmpty()){
			for (String weakness : monster.getWeakness()) {
				response += weakness + " ";
			}
		}
		return response;
	}

}
