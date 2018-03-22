package com.dani.app;

import com.dani.events.MyEvents;
import com.dani.utils.BotUtils;

import sx.blah.discord.api.IDiscordClient;

public class Client {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please enter the bots token as the first argument e.g java -jar thisjar.jar tokenhere");
			return;
		}

		IDiscordClient cli = BotUtils.getBuiltDiscordClient(args[0]);

		cli.getDispatcher().registerListener(new MyEvents());

		cli.login();
	}
}
