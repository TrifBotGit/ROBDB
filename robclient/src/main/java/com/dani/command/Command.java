package com.dani.command;

import lombok.Data;

@Data
public class Command {
	
	private String endPoint;
	
	private String variable;
	
	public Command(String message){
		this.endPoint = trimEndpoint(message);
		this.variable = trimVariable(message);
	}
	
	
	public String trimEndpoint(String message){
		String endPoint = message.split(" ")[0];
		return endPoint.substring(1);
	}
	
	public String trimVariable(String message){
		String variable = message.split(" ")[1];
		return variable;
	}

}
