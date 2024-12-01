// Fox class extends Bird and represents a Pinguin

public class Pinguin extends Bird{

	public Pinguin(String name,double age, String color) {
		super(name,age,color);
	}
	public Pinguin() {
		super();
	}

	public String toString() {
		return "Pinguin"+super.toString();
	}

	@Override
	public void eat() {
		System.out.println("Parrot eating krill");

	}

	public boolean equals(Object other) {
		if(!(other instanceof Pinguin)) {
			return false;
		}
		Pinguin p=(Pinguin)other;
		return this.getName().equals(p.getName())&&this.getColor().equals(p.getColor())&&(this.getAge()==p.getAge());
	}

}
