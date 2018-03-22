package com.dani.caller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

import com.dani.command.Command;
import com.dani.model.Monster;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServiceCaller {
	
	private static final String serviceURI = "http://localhost:8080/";
	
	private Gson gson;
	
	Monster monster;
	
	Reader reader;
	
	public Monster callService(Command command) throws MalformedURLException, IOException{
		reader = new InputStreamReader(new URL(serviceURI + command.getEndPoint() + "/" + command.getVariable()).openStream());
		gson = new GsonBuilder().create();
		monster = gson.fromJson(reader, Monster.class);
		return monster;
	}

}
