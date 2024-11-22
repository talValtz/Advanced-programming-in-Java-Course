
public abstract class  Mamal extends Animal {
	public Mamal(String name,double age, String color) {
		super(name,age,color);
	}
	public Mamal() {
		super();
	}

	public String toString() {
		return "Mamal "+super.toString();
	}
	 

}
