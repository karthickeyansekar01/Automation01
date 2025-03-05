package seleniumbasicsay2;

class Animal {  
    public void eat() {  
        System.out.println("Dog is a pet animal.");  
    }  
}  

  
class Vehicle {  
    public void drive() {  
        System.out.println("Karthi likes to drive Adventure bikes"
        		+ ".");  
    }  
}  
  

class AnimalVehicle {  
    private Animal animal;  
    private Vehicle vehicle;  
      
    public AnimalVehicle() {  
        animal = new Animal();  
        vehicle = new Vehicle();  
    }  
      
    public void eat() {  
        animal.eat();  
    }  
      
    public void drive() {  
        vehicle.drive();  
    }  
}  



public class Inheritance {
	
		public static void main(String[] args) {
			
			   AnimalVehicle animalVehicle = new AnimalVehicle();  
		        animalVehicle.eat(); // Output: Animal is eating.  
		        animalVehicle.drive(); // Output: Vehicle is being driven.  
			
			
						
		}}
	


