package land.builders.customcommandutil.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MainCommand implements CommandExecutor, TabCompleter {
	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

		if (!sender.hasPermission("customcommandutil.command")) {
			return false;
		}

		if (!(sender instanceof Player)) {
			return false; //獲得 plugins.yml 的 使用說明
		}



		return false; //獲得 plugins.yml 的 使用說明
	}

	@Override
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
//		List<String> tablist = ;
//		tablist.add("create");

		return null;
	}
}
