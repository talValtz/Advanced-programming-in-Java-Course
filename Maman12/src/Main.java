import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {
		 ArrayList<Animal> animals = new ArrayList<Animal>();

		    // Adding animals
			animals.add(new Dog("nuggets",1.1,"Blue merle"));
			animals.add(new Dog("buddy", 2.5, "Brown"));
			animals.add(new Cat("buddy", 2.5, "Brown"));
			 for (Animal animal : animals) {
		            System.out.println(animal);
		            animal.eat();
		            animal.sleep();
		        }
			 System.out.println(animals.get(1).equals(animals.get(2)));
			
	 
	 }
	
   

}
