import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		// Adding animals to pension
		ArrayList<Animal> pension = new ArrayList<Animal>();
		pension.add(new Dog("nuggets",1.1,"Blue merle"));
		pension.add(new Dog("buddy", 2.5, "Brown"));
		pension.add(new Cat("kitty", 2.5, "white"));
		pension.add(new Parrot("tuki", 3, "Green"));
		pension.add(new Pinguin("Pigi", 2.5, "Black and white"));
		pension.add(new Snake("Taily", 2.5, "Brown"));
		pension.add(new Fox("Foxi",1.75,"Grey"));
		
		//Scanning the data structure while executing the methods
		for (Animal animal : pension) {
			System.out.println(animal);
			animal.eat();
			animal.sleep();
			if(animal instanceof Dog) {
				((Dog) animal).seat();
			}
			else if(animal instanceof Parrot) {
				((Parrot)animal).fly();
			}
			else if(animal instanceof Snake) {
				((Snake)animal).crawl();
			}
			else if(animal instanceof Fox) {
				((Fox)animal).hunt();
			}
			System.out.println();
		}
		
		//Set up an animal with an owner
		Owner owner1 = new Owner("Alice", "1234567890");
		Dog originalDog = new Dog("Buddy", 3, "Brown", owner1);
		System.out.println("Original Dog:");
		System.out.println(originalDog);
		
		//Duplicate the animal
		Dog clonedDog = originalDog.clone();
		System.out.println("Cloned Dog:");
		System.out.println(clonedDog);
		
		// Change the duplicated animal's owner details
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
