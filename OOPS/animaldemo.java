// Abstraction is achieved in 2 ways :
//Abstract class
//Interfaces (Pure Abstraction)

abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("This animal breathes air");
    }
    Animal(){
        System.out.println("You are about to create an animal");
    }
}
class Horse extends Animal {
   Horse() {
       System.out.println("Wow, you have created a Horse!");
   }
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}
public class animaldemo {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
      horse.breathe();
   }
}
