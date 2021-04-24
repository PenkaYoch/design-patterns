package defaultPackage;

public class RoomUser extends User {

	private String roomNickname;
	
	public RoomUser(ChatMediator chatMediator, String firstName, String lastName, int age, String livingTown,
			String profession, String roomNickname) {
		super(chatMediator, firstName, lastName, age, livingTown, profession);
		this.roomNickname = roomNickname;
		chatMediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.getFirstName() + " " + this.getLastName()+ " with nickname " + this.getRoomNickname() + " sends new message: " + message);
		chatMediator.addBot();
		chatMediator.sendUserMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.getFirstName() + " " + this.getLastName() + " with nickname " + this.getRoomNickname() + " receives new message: " + message);
	}
	
	public String getRoomNickname() {
		return roomNickname;
	}

	public void setRoomNickname(String roomNickname) {
		this.roomNickname = roomNickname;
	}

	@Override
	public String toString() {
		return "RoomUser [roomNickname=" + roomNickname + ", chatMediator=" + chatMediator + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", livingTown=" + livingTown + ", profession="
				+ profession + "]";
	}

}
