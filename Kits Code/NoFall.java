package me.libraryaddict.librarys.Abilities;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import me.libraryaddict.Hungergames.Interfaces.Disableable;
import me.libraryaddict.Hungergames.Types.AbilityListener;

public class NoFall extends AbilityListener implements Disableable{
	@EventHandler
	public void onNoFallFall(EntityDamageEvent e) {
	Player nofall = (Player) e.getEntity();
	if (nofall instanceof Player && e.getCause() == DamageCause.FALL && hasAbility(nofall)) {
	e.setCancelled(true);
	}
	}
}
