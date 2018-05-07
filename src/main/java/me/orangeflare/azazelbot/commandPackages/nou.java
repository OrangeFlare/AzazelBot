package me.orangeflare.azazelbot.commandPackages;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.RequestBuffer;

public class nou {
    @EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event){
        String formattedMsg = event.getMessage().getContent().replace(" ", "").replace(",", "")
                .replace(".", "").replace("-", "").toLowerCase();
        if (formattedMsg.contains("gay") || formattedMsg.contains("nou") || formattedMsg.contains("n0u") || formattedMsg.contains("g4y") ||
                formattedMsg.contains("noyou") || formattedMsg.contains("noyu") || formattedMsg.contains("noyoo") || formattedMsg.contains("noyo") ||
                formattedMsg.contains("ñóù") || formattedMsg.contains("ñou") || formattedMsg.contains("ñóu") || formattedMsg.contains("nóu") ||
                formattedMsg.contains("nóù") || formattedMsg.contains("ñoù") || formattedMsg.contains("noù") || formattedMsg.contains("n0y0u") ||
                formattedMsg.contains("noy0u") || formattedMsg.contains("n0you") || formattedMsg.contains("n0u") || formattedMsg.contains("nоu") ||
                formattedMsg.contains("gaу")) {
            if (formattedMsg.contains("enough") || formattedMsg.contains("announce") || formattedMsg.contains("pronounce") || formattedMsg.contains("noyour")) {
                //do nothing
            } else if (event.getAuthor().getLongID() == 176108182056206336L || event.getAuthor().getLongID() == 253733469778083840L || event.getAuthor().getLongID() == 241685759348703232L) {
                System.out.println("[INFO] Disabling Tactical No U Launch");
                System.out.println("    Reason: " + event.getAuthor().getDisplayName(event.getGuild()) + " Sent Message");
            } else if (event.getMessage().getAuthor().isBot()){
                //do nothing
            } else {
                RequestBuffer.request(() -> {
                    try {
                        System.out.println("[INFO] Sending Retaliatory No U Strikes at " + event.getAuthor().getDisplayName(event.getGuild()));
                        event.getChannel().sendMessage("no u");
                    } catch (DiscordException error) {
                        System.err.println("[ERROR] Could Not Send Retaliatory No U Strikes");
                        error.printStackTrace();
                    }
                });
            }

        }
    }
}
