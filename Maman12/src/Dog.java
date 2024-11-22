
public class Dog extends Mamal {
	public Dog(String name,double age, String color) {
		super(name,age,color);
	}
	public Dog() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("Bonzo");
		
	}

	@Override
	public void sleep() {
		System.out.println("dogs are sleep for 15 hours per day");
		
	}
	public boolean equals(Object other) {
		if(!(other instanceof Dog)) {
			return false;
		}
		Dog d=(Dog)other;
		return this.getName().equals(d.getName())&&this.getColor().equals(d.getColor())&&(this.getAge()==d.getAge());
	}

}
