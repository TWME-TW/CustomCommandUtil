package land.builders.customcommandutil.datamanager;

import land.builders.customcommandutil.CustomCommandUtil;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ConfigDataManager {
	public static boolean DEBUG = true;

	public static class PLUGIN_SETTINGS {
		public static String PREFIX;
		public static String MESSAGES_FILE;
	}

	public static void loadConfigFile() {
		CustomCommandUtil instance = CustomCommandUtil.getInstance();

		String configFileName = "config.yml";
		File configFile = new File(instance.getDataFolder(), configFileName);

		if (!configFile.exists()) {
			instance.saveResource(configFileName, false);
		}
		YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(instance.getResource(configFileName), StandardCharsets.UTF_8));
		YamlConfiguration config = YamlConfiguration.loadConfiguration(configFile);

		config.addDefaults(defaultConfig);

		DEBUG = config.getBoolean("DEBUG");

		PLUGIN_SETTINGS.PREFIX = config.getString("PLUGIN_SETTINGS.PREFIX");
		PLUGIN_SETTINGS.MESSAGES_FILE = config.getString("PLUGIN_SETTINGS.MESSAGES_FILE");
	}
}
