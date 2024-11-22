
public abstract class Animal {
	private String name;
	private double age;
	private String color;
	
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
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name;
	}
	public double getAge() {
		return this.age;
	}
	public String toString() {
		return String.format("name: %s\n age: %.2f\n color: %s", getName(),getAge(),getColor());
	}
	public abstract void eat();
	
	public abstract void sleep();
	

}
