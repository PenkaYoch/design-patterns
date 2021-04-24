package defaultPackage;

public class Main {

	public static void main(String[] args) {
		
		ChatMediator chatRoom = new ChatRoom("First room");
		
		User firstUser = new RoomUser(chatRoom, "Ivan", "Ivanov", 25, "Plovdiv", "programmer", "Vankata");
		User secondUser = new RoomUser(chatRoom, "Nikol", "Todorova", 35, "Plovdiv", "doctor", "Nikito");
		User thirdUser = new RoomUser(chatRoom, "Dimitor", "Petrov", 21, "Plovdiv", "programmer", "Mitko");
		
		firstUser.sendMessage("Hello, everyone!");
		System.out.println();
		secondUser.sendMessage("Hello, cats!");
		System.out.println();
		thirdUser.sendMessage("I have a pet which is a cat.");
		System.out.println();
		firstUser.sendMessage("Hello, everyone!");

	}

}
