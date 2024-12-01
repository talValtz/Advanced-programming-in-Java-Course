// Cat class extends Reptile and represents a Snake

public class Snake extends Reptile{
	//Constructors
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
	public void crawl() {
		System.out.println("I'm crawling");
		
	}


	public boolean equals(Object other) {
		if(!(other instanceof Snake)) {
			return false;
		}
		Snake s=(Snake)other;
		return this.getName().equals(s.getName())&&this.getColor().equals(s.getColor())&&(this.getAge()==s.getAge());
	}

}
