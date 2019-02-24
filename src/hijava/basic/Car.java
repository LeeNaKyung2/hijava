package hijava.basic;

public class Car {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
	
		Car car1 = factory.createCar("김일수");
		Car car2 = factory.createCar("김일수");
		System.out.println(car1==car2);
		
		Car car3 = factory.createCar("김이수");
		Car car4 = factory.createCar("김이수");
		System.out.println(car3==car4);
		
		System.out.println(car1==car3);
	}
}
