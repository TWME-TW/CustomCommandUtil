package land.builders.customcommandutil.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

import java.util.Collection;

public class PlayerCommandSendEventListener implements Listener {
	private static Collection<String> commandList;
	private static Player player;

	@EventHandler
	public void onPlayerCommandSendEventListener(PlayerCommandSendEvent event){
		commandList = event.getCommands();
		player = event.getPlayer();



	}
}
