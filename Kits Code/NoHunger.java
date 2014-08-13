package me.libraryaddict.librarys.Abilities;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

import me.libraryaddict.Hungergames.Interfaces.Disableable;
import me.libraryaddict.Hungergames.Types.AbilityListener;

public class NoHunger extends AbilityListener implements Disableable{
	@EventHandler
	public void onNoHungerMove(PlayerMoveEvent e) {
	Player p = e.getPlayer();
	if (hasAbility(p) && p.getFoodLevel() <= 19) {
	p.setFoodLevel(1000);
	}
	}
}
