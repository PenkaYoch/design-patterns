package interfacesPackage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import defaultPackage.Animal;

public class ZooFood implements Observable {

	private String name;
	private float price;
	private Date expiryDate;
	private Animal animalCategory;
	private boolean isSold;

	private List<Observer> observers;

	public ZooFood(String name, float price, Date expiryDate, Animal category, boolean isSold) {
		super();
		this.observers = new ArrayList<>();
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.animalCategory = category;
		this.isSold = isSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		this.notifyObservers();
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
		this.notifyObservers();
	}

	public Animal getAnimalCategory() {
		return animalCategory;
	}

	public void setAnimalCategory(Animal animalCategory) {
		this.animalCategory = animalCategory;
		this.notifyObservers();
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
		this.notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
		observer.setZooFood(this);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}

	@Override
	public ZooFood getNewZooFoodInfo() {
		return new ZooFood(this.getName(), this.getPrice(), this.getExpiryDate(), this.getAnimalCategory(), this.isSold());
	}

	@Override
	public String toString() {
		return "ZooFood [name=" + name + ", price=" + price + ", expiryDate=" + expiryDate + ", animalCategory="
				+ animalCategory + ", isSold=" + this.isSold + "]";
	}


}
