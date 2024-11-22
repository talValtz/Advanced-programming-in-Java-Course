
public abstract class Reptile extends Mamal{
	public Reptile(String name,double age, String color) {
		super(name,age,color);
	}
	public Reptile() {
		super();
	}
	public String toString() {
		return "Reptile"+super.toString();
	}

}
