
public class Dog extends Mamal{
	private Owner owner;
	public Dog(String name,double age, String color) {
		super(name,age,color);
		this.owner=new Owner();
	}
	public Dog(String name,double age, String color,Owner owner) {
		super(name,age,color);
		this.owner=owner;
	}
	public Dog() {
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
		System.out.println("Bonzo");
		
	}

	@Override
	public void sleep() {
		System.out.println("dogs are sleep for 15 hours per day");
		
	}
	@Override
    public String toString() {
        return super.toString() + (owner.getName() != null ? ", Owner: " + owner : "");
    }
	public boolean equals(Object other) {
		if(!(other instanceof Dog)) {
			return false;
		}
		Dog d=(Dog)other;
		return this.getName().equals(d.getName())&&this.getColor().equals(d.getColor())&&(this.getAge()==d.getAge());
	}
	@Override
	public void AvgLifespan() {
		System.out.println("The average lifespan for a pet dog is probably around 10 to 13 years.");
		
	}
	  @Override
	    public Dog clone() {
	        try {
	            Dog cloned = (Dog) super.clone();
	            if (this.owner != null) {
	                cloned.owner = new Owner(this.owner.getName(), this.owner.getPhoneNumber());
	            }
	            return cloned;
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError(); // This should never happen
	        }
	    }

}
