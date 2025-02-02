
public abstract class Animal implements Cloneable {
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
	
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setAge(double age) {
		this.age=age;
	}

	 @Override
	    public String toString() {
	        return String.format("name: %s\n age: %.2f\n color: %s", name, age, color);
	    }
	public abstract void eat();
	
	public abstract void sleep();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
	

}
