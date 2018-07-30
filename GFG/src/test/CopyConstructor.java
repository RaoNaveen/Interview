package test;

class Car {
	private String carName;

	public Car(String carName) {
		this.carName=carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}
}

class People {
	private String name;
	private final Car car;

	public People(People people) {
		this.name = people.getName();
		this.car=new Car(people.getCar().getCarName());
	}

	public People(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", car=" + car + "]";
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		People people=new People("Naveen", new Car("Alto"));
		People people2=new People(people);
		System.out.println(people);
		System.out.println(people2);
		people.getCar().setCarName("Zen");
		System.out.println(people);
		System.out.println(people2);
	}
}
