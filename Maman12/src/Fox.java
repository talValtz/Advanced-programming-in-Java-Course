// Fox class extends Mamal and represents a fox

public class Fox extends Mamal{
	
	public Fox(String name,double age, String color) {
		super(name,age,color);
	}
	public Fox() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("I'm eating frog");

	}
	public void hunt() {
		System.out.println("I'm hunting");

	}
	public String toString() {
		return "Fox"+super.toString();
	}

	public boolean equals(Object other) {
		if(!(other instanceof Fox)) {
			return false;
		}
		Fox c=(Fox)other;
		return this.getName().equals(c.getName())&&this.getColor().equals(c.getColor())&&(this.getAge()==c.getAge());
	}
}
