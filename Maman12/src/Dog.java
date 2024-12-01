// Dog class extends Mamal and represents a dog

public class Dog extends Mamal{
	private Owner owner;
	//Constructors
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
		System.out.println("I'm eating bonzo");
		
	}
	
	public void seat() {
		System.out.println("Seating");
	}


	@Override
	public String toString() {
        return super.toString() +this.ownerString();
    }
	private String ownerString() {
		if(owner.getName()!=null) {
			return "Owner:"+owner.toString();
		}
		return "";
		
	}
	public boolean equals(Object other) {
		if(!(other instanceof Dog)) {
			return false;
		}
		Dog d=(Dog)other;
		return this.getName().equals(d.getName())&&this.getColor().equals(d.getColor())&&(this.getAge()==d.getAge());
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
