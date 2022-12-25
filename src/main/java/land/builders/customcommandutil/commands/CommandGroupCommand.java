package land.builders.customcommandutil.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CommandGroupCommand implements TabCompleter {
	public static void commandGroupCommand(CommandSender sender,String[] args){

		if(!sender.hasPermission("customcommandutil.command.create")) {

		}
	}

	@Override
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		return null;
	}
}
