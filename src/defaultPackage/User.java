package defaultPackage;

public abstract class User {
	
	protected ChatMediator chatMediator;
	// use properties
	protected String firstName;
	protected String lastName;
	protected int age;
	protected String livingTown;
	protected String profession;
	
	public User(ChatMediator chatMediator, String firstName, String lastName, int age, String livingTown, String profession) {
		super();
		this.chatMediator = chatMediator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.livingTown = livingTown;
		this.profession = profession;
	}
	
	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLivingTown() {
		return livingTown;
	}

	public void setLivingTown(String livingTown) {
		this.livingTown = livingTown;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return "User [chatMediator=" + chatMediator + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", livingTown=" + livingTown + ", profession=" + profession + "]";
	}
}
