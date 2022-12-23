package land.builders.customcommandutil.util;

import land.builders.customcommandutil.datamanager.ConfigDataManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class MessagesUtil {
	private static final ConsoleCommandSender console = Bukkit.getConsoleSender();

	public static void DebugLog(String log) {
		if (ConfigDataManager.DEBUG) {
			console.sendMessage(ChatColor.translateAlternateColorCodes('&', ConfigDataManager.PREFIX + "&2[DebugLog] &f" + log));
		}


	}


}
