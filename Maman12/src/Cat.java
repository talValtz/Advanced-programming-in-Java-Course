// Cat class extends Mamal and represents a cat
public class Cat extends Mamal{
	
	private Owner owner;
	//Contractors
	public Cat(String name,double age, String color) {
		super(name,age,color);
		this.owner=new Owner();
		
	}
	public Cat(String name,double age, String color,Owner owner) {
		super(name,age,color);
		this.owner=owner;
		
	}
	public Cat() {
		super();
		this.owner=new Owner();
	}
	
	//Getter
	public Owner getOwner() {
		return this.owner;
	}
	//Setter
	public void setOwner(Owner owner) {
		this.owner=owner;
	}

	@Override
	public void eat() {
		System.out.println("I'm  eating fish");
		
	}

	
	public boolean equals(Object other) {
		if(!(other instanceof Cat)) {
			return false;
		}
		Cat c=(Cat)other;
		return this.getName().equals(c.getName())&&this.getColor().equals(c.getColor())&&(this.getAge()==c.getAge());
	}


}
