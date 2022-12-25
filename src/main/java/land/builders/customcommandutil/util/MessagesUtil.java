package land.builders.customcommandutil.util;

import land.builders.customcommandutil.datamanager.ConfigDataManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class MessagesUtil {
	private static final ConsoleCommandSender console = Bukkit.getConsoleSender();

	public static void debugLog(String log) {
		if (ConfigDataManager.DEBUG) {
			console.sendMessage(ChatColor.translateAlternateColorCodes('&', ConfigDataManager.PLUGIN_SETTINGS.PREFIX + "&2[DebugLog] &f" + log));
		}
	}

	public static void playerMessage(Player player, String message) {
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', ConfigDataManager.PLUGIN_SETTINGS.PREFIX + message));
	}


}
