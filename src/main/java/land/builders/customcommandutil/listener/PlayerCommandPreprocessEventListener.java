package land.builders.customcommandutil.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.ArrayList;

public class PlayerCommandPreprocessEventListener implements Listener {

	private static String command;
	private static Player player;
	private static ArrayList customCommandList = new ArrayList();

	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {

		command = event.getMessage();
		player = event.getPlayer();


	}

	public static void addCustomCommandList(String customCommand){
		customCommandList.add(customCommand);
	}
}
