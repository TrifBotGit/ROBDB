package com.dani.events;

import java.io.IOException;
import java.net.MalformedURLException;

import com.dani.caller.ServiceCaller;
import com.dani.caller.ServiceCallerSingleton;
import com.dani.command.Command;
import com.dani.formatter.Formatter;
import com.dani.formatter.FormatterSingleton;
import com.dani.model.MonsterDTO;
import com.dani.utils.BotUtils;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class MyEvents {
	
	MonsterDTO monster;
	
	ServiceCaller caller;
	
	Formatter formatter;
	
	@EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event) throws MalformedURLException, IOException{
        if(event.getMessage().getContent().startsWith(BotUtils.BOT_PREFIX)&&!event.getAuthor().isBot()){
        	if(event.getMessage().getContent().startsWith("!")){
        		System.out.println(event.getMessage().getContent());
        		Command command = new Command(event.getMessage().getContent());
        		System.out.println(command.getEndPoint() + " - " + command.getVariable());
        		caller = ServiceCallerSingleton.returnInstance();
        		monster = caller.callService(new Command(event.getMessage().getContent()));
        		formatter = FormatterSingleton.returnInstance();
        		BotUtils.sendMessage(event.getChannel(), formatter.buildMonsterResponse(monster));
        	}else{
        		
        	}
        } 	
    }

}
