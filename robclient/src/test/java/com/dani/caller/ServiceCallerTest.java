package com.dani.caller;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import com.dani.command.Command;
import com.dani.model.Monster;

public class ServiceCallerTest {
	
	ServiceCaller caller;
	
	@Test
	public void testServiceCaller() throws MalformedURLException, IOException{
		caller = ServiceCallerSingleton.returnInstance();
		Command command = new Command("!monster hey");
		Monster monster = caller.callService(command);
		assertThat(monster.getName().equals("hey"));
	}

}
