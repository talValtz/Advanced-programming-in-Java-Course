
public abstract class Bird extends Animal{
	public Bird(String name,double age, String color) {
		super(name,age,color);
	}
	public Bird() {
		super();
	}
	public String toString() {
		return "Bird "+super.toString();
	}

}
