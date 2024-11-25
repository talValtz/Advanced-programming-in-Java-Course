import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {
		 ArrayList<Animal> animals = new ArrayList<Animal>();

		    // Adding animals
		
			animals.add(new Dog("nuggets",1.1,"Blue merle"));
			animals.add(new Dog("buddy", 2.5, "Brown"));
			animals.add(new Cat("buddy", 2.5, "Brown"));
			animals.add(new Parrot("tuki", 3, "Green"));
			animals.add(new Pinguin("buddy", 2.5, "Brown"));
			 for (Animal animal : animals) {
		            System.out.println(animal);
		            animal.eat();
		            animal.sleep();
		        }
			 System.out.println(animals.get(1).equals(animals.get(2)));
			 System.out.println("-------------");
			 
			 Owner owner1 = new Owner("Alice", "1234567890");
		        Dog originalDog = new Dog("Buddy", 3, "Brown", owner1);

		        System.out.println("Original Dog:");
		        System.out.println(originalDog);

		        Dog clonedDog = originalDog.clone();
		        System.out.println("Cloned Dog:");
		        System.out.println(clonedDog);
		        clonedDog.getOwner().setName("Bob");
		        clonedDog.getOwner().setPhoneNumber("0987654321");
		        clonedDog.setName("Max");
		       

		        System.out.println("\nAfter modification:");
		        System.out.println("Original Dog:");
		        System.out.println(originalDog);
		        System.out.println("Cloned Dog:");
		        System.out.println(clonedDog);
			
	 
	 }
	
   

}
