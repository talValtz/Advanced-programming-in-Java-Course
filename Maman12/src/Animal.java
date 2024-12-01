// Abstract Animal class represents a general animal with basic properties and methods
public abstract class Animal implements Cloneable {
	private String name;
	private double age;
	private String color;
	
	//Constructors
	public Animal() {
		name="";
		age=-1;
		color="";
	}
	public Animal(String name,double age, String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	//Getters
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name;
	}
	public double getAge() {
		return this.age;
	}
	
	//Setters
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setAge(double age) {
		this.age=age;
	}

	//toString Function
	@Override
	public String toString() {
		return String.format("name: %s, age: %.2f, color: %s", name, age, color);
	}

	public void sleep() {
		System.out.println(this.name+" is sleeping");
	}

	public abstract void eat();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
