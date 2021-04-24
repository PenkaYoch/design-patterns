package defaultPackage;

import java.util.List;
import java.util.ArrayList;

public class ChatRoom implements ChatMediator {

	private List<User> users;
	private ChatBotSingleton chatBot;
	private String roomName;

	public ChatRoom(String roomName) {
		this.users = new ArrayList<>();
		this.roomName = roomName;
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendUserMessage(String message, User user) {
		// validate the message
		String recentMessage = chatBot.isUserMessageContainsCat(message)
				? "This message contains 'cat' and it's not valid!"
				: message;
		// get the changed list of users after chatBot validate the message
		this.users = chatBot.isUserMessageContainsCat(message, users, user);

		for (User recentUser : this.users) {
			if (recentUser != user) {
				recentUser.receiveMessage(recentMessage);
			}
		}
	}

	@Override
	public void addBot() {
		if (chatBot == null) {
			this.chatBot = ChatBotSingleton.getInstance();
			chatBot.isBotConnected();
		}
	}
}
