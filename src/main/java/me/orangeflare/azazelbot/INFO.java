package me.orangeflare.azazelbot;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;

public class INFO {
    //public static String BOT_TOKEN = "NDM3MzQ1ODQ2NDU1OTU5NTUy.Db0uSw.ywfOP85A3N8Vq_7CIVAJ-UKEMvo";
    // THIS API TOKEN WILL BE REVOKED DUE TO SECURITY ISSUE
    // YOU MUST SUPPLY TOKEN WHEN STARTING BOT
    // Example: "java -jar azazelbot.jar TokenHere"
    public static IDiscordClient getBuiltDiscordClient(String BOT_TOKEN){
        return new ClientBuilder()
                .withToken(BOT_TOKEN)
                .build();
    }
}
