
public class Cat extends Mamal{
	private Owner owner;
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
	public Owner getOwner() {
		return this.owner;
	}
	public void setOwner(Owner owner) {
		this.owner=owner;
	}

	@Override
	public void eat() {
		System.out.println("cats are eating fish");
		
	}

	@Override
	public void sleep() {
		System.out.println("cats are sleep for 14 hours per day");
		
	}
	
	@Override
	public String toString() {
        return super.toString() + (owner.getName() != null ? ", Owner: " + owner : "");
    }
	
	public boolean equals(Object other) {
		if(!(other instanceof Cat)) {
			return false;
		}
		Cat c=(Cat)other;
		return this.getName().equals(c.getName())&&this.getColor().equals(c.getColor())&&(this.getAge()==c.getAge());
	}
	@Override
	public void AvgLifespan() {
		System.out.println("The average lifespan for a pet cat is probably around 13 to 14 years.");
		
	}

}
