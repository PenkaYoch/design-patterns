package interfacesPackage;
public class ZooFoodObserver implements Observer {
	
	private String name;
	private Observable zooFood;
	
	public ZooFoodObserver(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.zooFood == null) {
			System.out.println("Клиент с име: "+ this.getName() + "не е добавен към листа с Observer-ри.");
			return;
		}
		ZooFood newZooFoodInfo = this.zooFood.getNewZooFoodInfo();
		System.out.println(this.getName() + " беше променен: " + newZooFoodInfo.toString());
	}

	@Override
	public void setZooFood(Observable food) {
		this.zooFood = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
