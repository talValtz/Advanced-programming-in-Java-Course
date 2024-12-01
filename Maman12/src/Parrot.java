// Cat class extends Bird and represents a Parrot

public class Parrot extends Bird{

	public Parrot(String name,double age, String color) {
		super(name,age,color);
	}
	public Parrot() {
		super();
	}

	public void fly() {
		System.out.println(this.getName()+"is flying");
	}

	@Override
	public void eat() {
		System.out.println("Pinguin eating nuts");

	}

	public boolean equals(Object other) {
		if(!(other instanceof Parrot)) {
			return false;
		}
		Parrot p=(Parrot)other;
		return this.getName().equals(p.getName())&&this.getColor().equals(p.getColor())&&(this.getAge()==p.getAge());
	}


}
