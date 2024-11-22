
public class Snake extends Reptile{
	public Snake(String name,double age, String color) {
		super(name,age,color);
	}
	public Snake() {
		super();
	}
	public String toString() {
		return "Snake"+super.toString();
	}

	@Override
	public void eat() {
		System.out.println("snakes eat warm blooded prey (rodents, rabbits, squirrels, birds)");
		
	}

	@Override
	public void sleep() {
		System.out.println("snakes sleep about 16 hours per day");
		
	}
	public void move() {
		System.out.println("reptilian");
	}
	public boolean equals(Object other) {
		if(!(other instanceof Snake)) {
			return false;
		}
		Snake s=(Snake)other;
		return this.getName().equals(s.getName())&&this.getColor().equals(s.getColor())&&(this.getAge()==s.getAge());
	}

}
