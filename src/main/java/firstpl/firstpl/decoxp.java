package firstpl.firstpl;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class decoxp implements Listener {
    @EventHandler
    //when player collect exp, show message to player what exp he collect
    public void onExpChange(PlayerExpChangeEvent e) {
        //if exp > 1 then show message with add s to exp
        if (e.getAmount() > 1) {
            e.getPlayer().sendMessage("You collect " + e.getAmount() + " exps");
            //send message about exp player will get to next level
        } else {
            e.getPlayer().sendMessage("You collect " + e.getAmount() + " exp");
        }
        //get player exp
        float exp = e.getPlayer().getExp();
        //get player level
        int level = e.getPlayer().getLevel();
        //get player exp to next level
        float expToNextLevel = e.getPlayer().getExpToLevel();
        float test = expToNextLevel-(expToNextLevel*exp);
        //convert test to int
        int test2 = (int) test;
        //send message to player about exp he get to next level
        e.getPlayer().sendMessage("You will get to level "+(level+1)+" in next " + test2 + " exps");
    }
}
