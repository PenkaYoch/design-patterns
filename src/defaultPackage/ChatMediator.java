package defaultPackage;

public interface ChatMediator {

	public void addUser(User user);
	public void sendUserMessage(String message, User user);
	public void addBot();
}
