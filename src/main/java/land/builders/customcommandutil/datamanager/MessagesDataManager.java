package land.builders.customcommandutil.datamanager;

import land.builders.customcommandutil.CustomCommandUtil;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MessagesDataManager {

	public static class CUSTOM_COMMAND_UTIL {
		public static String NO_PERMISSION;
		public static String PREFIX;
		public static String EDIT;
		public static String DELETE;
		public static String MOVE_UP;
		public static String MOVE_DOWN;
		public static String PREVIOUS_PAGE;
		public static String NEXT_PAGE;
	}

	public static class COMMAND_GROUP {
		public static String PREFIX;
		public static String EXIST_COMMAND_GROUP;
		public static String PRIVATE_COMMAND_GROUP;
		public static String PUBLIC_COMMAND_GROUP;
		public static String NO_EXIST_COMMAND_GROUP;
		public static String CREATE_COMMAND_GROUP;
		public static String COMMAND_GROUP_NAME;
		public static String TRIGGER_COMMAND;
		public static String COMMAND_LIST;
		public static String NEXT;
		public static String ANOTHER;
	}

	public static class COMMAND_REPLACER {
		public static String PREFIX;
		public static String EXIST_KEYWORDS;
		public static String NO_EXIST_KEYWORDS;
		public static String CREATE_KEYWORDS;
		public static String ARROW_SYMBOL;
	}

	public static void loadMessagesFile() {
		CustomCommandUtil instance = CustomCommandUtil.getInstance();

		String messagesFileName = ConfigDataManager.PLUGIN_SETTINGS.MESSAGES_FILE;
		File messagesFile = new File(instance.getDataFolder(), messagesFileName);

		if (!messagesFile.exists()) {
			instance.saveResource(messagesFileName, false);
		}
		YamlConfiguration defaultMessages = YamlConfiguration.loadConfiguration(new InputStreamReader(instance.getResource(messagesFileName), StandardCharsets.UTF_8));

		YamlConfiguration messages = YamlConfiguration.loadConfiguration(messagesFile);
		messages.addDefaults(defaultMessages);


		CUSTOM_COMMAND_UTIL.NO_PERMISSION = messages.getString("CUSTOM_COMMAND_UTIL.NO_PERMISSION");
		CUSTOM_COMMAND_UTIL.PREFIX = messages.getString("CUSTOM_COMMAND_UTIL.PREFIX");
		CUSTOM_COMMAND_UTIL.EDIT = messages.getString("CUSTOM_COMMAND_UTIL.EDIT");
		CUSTOM_COMMAND_UTIL.DELETE = messages.getString("CUSTOM_COMMAND_UTIL.DELETE");
		CUSTOM_COMMAND_UTIL.MOVE_UP = messages.getString("CUSTOM_COMMAND_UTIL.MOVE_UP");
		CUSTOM_COMMAND_UTIL.MOVE_DOWN = messages.getString("CUSTOM_COMMAND_UTIL.MOVE_DOWN");
		CUSTOM_COMMAND_UTIL.PREVIOUS_PAGE = messages.getString("CUSTOM_COMMAND_UTIL.PREVIOUS_PAGE");
		CUSTOM_COMMAND_UTIL.NEXT_PAGE = messages.getString("CUSTOM_COMMAND_UTIL.NEXT_PAGE");


		COMMAND_GROUP.PREFIX = messages.getString("COMMAND_GROUP.PREFIX");
		COMMAND_GROUP.EXIST_COMMAND_GROUP = messages.getString("COMMAND_GROUP.EXIST_COMMAND_GROUP");
		COMMAND_GROUP.PRIVATE_COMMAND_GROUP = messages.getString("COMMAND_GROUP.PRIVATE_COMMAND_GROUP");
		COMMAND_GROUP.PUBLIC_COMMAND_GROUP = messages.getString("COMMAND_GROUP.PUBLIC_COMMAND_GROUP");
		COMMAND_GROUP.ANOTHER = messages.getString("COMMAND_GROUP.ANOTHER");
		COMMAND_GROUP.NO_EXIST_COMMAND_GROUP = messages.getString("COMMAND_GROUP.NO_EXIST_COMMAND_GROUP");
		COMMAND_GROUP.CREATE_COMMAND_GROUP = messages.getString("COMMAND_GROUP.CREATE_COMMAND_GROUP");
		COMMAND_GROUP.COMMAND_GROUP_NAME = messages.getString("COMMAND_GROUP.COMMAND_GROUP_NAME");
		COMMAND_GROUP.TRIGGER_COMMAND = messages.getString("COMMAND_GROUP.TRIGGER_COMMAND");
		COMMAND_GROUP.COMMAND_LIST = messages.getString("COMMAND_GROUP.COMMAND_LIST");
		COMMAND_GROUP.NEXT = messages.getString("COMMAND_GROUP.NEXT");


		COMMAND_REPLACER.PREFIX = messages.getString("COMMAND_REPLACER.PREFIX");
		COMMAND_REPLACER.EXIST_KEYWORDS = messages.getString("COMMAND_REPLACER.EXIST_KEYWORDS");
		COMMAND_REPLACER.NO_EXIST_KEYWORDS = messages.getString("COMMAND_REPLACER.NO_EXIST_KEYWORDS");
		COMMAND_REPLACER.CREATE_KEYWORDS = messages.getString("COMMAND_REPLACER.CREATE_KEYWORDS");
		COMMAND_REPLACER.ARROW_SYMBOL = messages.getString("COMMAND_REPLACER.ARROW_SYMBOL");

	}
}
