
public class Cat extends Mamal{
	public Cat(String name,double age, String color) {
		super(name,age,color);;
	}
	public Cat() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("cats are eating fish");
		
	}

	@Override
	public void sleep() {
		System.out.println("cats are sleep for 14 hours per day");
		
	}
	public boolean equals(Object other) {
		if(!(other instanceof Cat)) {
			return false;
		}
		Cat c=(Cat)other;
		return this.getName().equals(c.getName())&&this.getColor().equals(c.getColor())&&(this.getAge()==c.getAge());
	}

}
