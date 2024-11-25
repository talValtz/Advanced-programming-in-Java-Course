
public class Parrot extends Bird{
	
	public Parrot(String name,double age, String color) {
		super(name,age,color);
	}
	public Parrot() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("Pinguin eating Krill");
		
	}

	@Override
	public void sleep() {
		System.out.println("dogs are sleep for 11 hours per day");
		
	}
	public boolean equals(Object other) {
		if(!(other instanceof Parrot)) {
			return false;
		}
		Parrot p=(Parrot)other;
		return this.getName().equals(p.getName())&&this.getColor().equals(p.getColor())&&(this.getAge()==p.getAge());
	}
	@Override
	public void fly() {
		System.out.println("Average parrot can fly up to 30 miles");
		
	}

}
