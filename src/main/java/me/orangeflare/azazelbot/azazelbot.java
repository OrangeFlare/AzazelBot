package me.orangeflare.azazelbot;

import sx.blah.discord.api.IDiscordClient;
import me.orangeflare.azazelbot.commandPackages.nou;

public class azazelbot {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("No API Token was Provided!");
            System.err.println("    In the startup script please add API token after jar Ex: 'java -jar shrokjava.jar TokenHere'");
            return;
        }
        IDiscordClient bot = INFO.getBuiltDiscordClient(args[0]);

        bot.getDispatcher().registerListener(new nou());

        bot.login();
    }
}
