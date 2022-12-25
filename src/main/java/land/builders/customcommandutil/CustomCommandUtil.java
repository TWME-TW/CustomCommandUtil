package land.builders.customcommandutil;

import land.builders.customcommandutil.commands.MainCommand;
import land.builders.customcommandutil.listener.PlayerCommandPreprocessEventListener;
import land.builders.customcommandutil.listener.PlayerCommandSendEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCommandUtil extends JavaPlugin {

	private static CustomCommandUtil instance;

	@Override
	public void onEnable() {
		instance = this;

		registerListener();
		registerCommands();
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}

	public static CustomCommandUtil getInstance() {
		return instance;
	}

	private void registerListener() {
		getServer().getPluginManager().registerEvents(new PlayerCommandPreprocessEventListener(), instance);
		getServer().getPluginManager().registerEvents(new PlayerCommandSendEventListener(),instance);
	}

	private void registerCommands() {
		this.getCommand("customcommandutil").setExecutor(new MainCommand());
	}
}
