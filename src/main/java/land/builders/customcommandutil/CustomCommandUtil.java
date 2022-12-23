package land.builders.customcommandutil;

import land.builders.customcommandutil.listener.PlayerCommandPreprocessEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCommandUtil extends JavaPlugin {

	private static CustomCommandUtil instance;

	@Override
	public void onEnable() {
		instance = this;

		registerListener();
		

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
	}
}
