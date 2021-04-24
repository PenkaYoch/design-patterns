package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class ChatBotSingleton {
	
	private static ChatBotSingleton chatBot;

	private ChatBotSingleton() {
	}

	public static ChatBotSingleton getInstance() {

		// if it does not exist, we create an instance of object
		if (chatBot == null) {
			chatBot = new ChatBotSingleton();
		}
		// return singleton instance
		return chatBot;
	}

	public void isBotConnected() {
		System.out.println("The chatBot is connected successfully.");
	}
	
	public boolean isUserMessageContainsCat(String message) {
		return message.contains("cat");
	}
	
	public List<User> isUserMessageContainsCat(String message, List<User> users, User user) {
		List<User> list = users;
		if(message.contains("cat")) {
			list.remove(user);
			System.out.println("This user is removed: " + user.toString());
			return list;
		} else {
			return list;
		}
	}
	
}
