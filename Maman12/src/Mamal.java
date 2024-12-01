// Abstract Mamal class extends Animal and represents general mammal behaviors
public abstract class  Mamal extends Animal {
	
	public Mamal(String name,double age, String color) {
		super(name,age,color);
	}
	public Mamal() {
		super();
	}
	
	@Override
	public String toString() {
		return "Mamal "+super.toString();
	}
	
}
