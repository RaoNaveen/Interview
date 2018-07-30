package test;

class Address implements Cloneable {
	private String city;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class AQ{
	
}

class WQ extends AQ{
	private String str;
	public WQ() {
		System.out.println("Default");
	}
	
	public WQ(String str) {
		this.str=str;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class XYZ extends WQ implements Cloneable {
	private int age;
	private String name;
	private Address address;
	
	
	public XYZ() {
		
	}

	public XYZ(int age, String name, Address address) {
		super(name);
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "XYZ [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	protected Object asdf() throws CloneNotSupportedException {
		XYZ xyz= (XYZ)super.clone();
		xyz.address = (Address) address.clone();
		return xyz;
	}
}

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("GGN", "HAR");
		XYZ clone = new XYZ(2, "Naveen", address);
		XYZ clone2 = (XYZ) clone.asdf();
		System.out.println(clone);
		System.out.println(clone2);
		clone.setAge(4);
		clone.getAddress().setCity("HAlwa");
		System.out.println(clone);
		System.out.println(clone2);
		
	}
}
