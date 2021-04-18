package defaultPackage;
import java.util.Calendar;
import java.util.Date;

import interfacesPackage.Observable;
import interfacesPackage.Observer;
import interfacesPackage.ZooFood;
import interfacesPackage.ZooFoodObserver;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 11, 31, 59, 59, 59);
		Date date = calendar.getTime();
		
		// create instance of Observable
		ZooFood zFood = new ZooFood("������ �� ����", 12.50f, date, Animal.CATS, false);
		
		// add observers
		Observer firstObserver = new ZooFoodObserver("������ 1: ");
		zFood.addObserver(firstObserver);
		
		Observer secondObserver = new ZooFoodObserver("������ 2: ");
		zFood.addObserver(secondObserver);
		
		Observer thirdObserver = new ZooFoodObserver("������ 3: ");
		zFood.addObserver(thirdObserver);
		
		// make changes 
		zFood.setPrice(10f);
		System.out.println();
		
		zFood.setName("������ �� ��������� ���� :D");
		System.out.println();
		
		zFood.setSold(true);
	}

}
