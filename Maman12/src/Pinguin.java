
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
		System.out.println("Parrot diet consists mainly of seeds, fruits, nuts, flowers, and leav");
		
	}
	public void fly() {
		System.out.println("Technicly pinguins can not fly");
	}

	@Override
	public void sleep() {
		System.out.println("dogs are sleep for 12 hours per day");
		
	}
	public boolean equals(Object other) {
		if(!(other instanceof Pinguin)) {
			return false;
		}
		Pinguin p=(Pinguin)other;
		return this.getName().equals(p.getName())&&this.getColor().equals(p.getColor())&&(this.getAge()==p.getAge());
	}

}
