package land.builders.customcommandutil.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

public class TabCompleteEventListener implements Listener {

	Player player;

	@EventHandler
	public void onTabComplete(TabCompleteEvent event) {
		player = (Player) event.getSender();

	}
}
