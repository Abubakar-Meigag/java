package abstractKeyword;

// Abstract class: A class that cannot be instantiated directly and may contain abstract methods (methods without implementation)
// Abstract classes serve as templates/blueprints for other classes to extend and implement

abstract class Car {
      // Abstract method: Declared without a body, must be implemented by subclasses
      // Forces all concrete subclasses to provide their own implementation
      public abstract void drive();

      // Concrete method: Abstract classes can have regular methods with implementation
      // This method is inherited by all subclasses and can be used as-is
      public void playMusic(){
            System.out.println("play Music...");
      }
}

// Concrete class BMW extends the abstract Car class
// BMW must implement all abstract methods from Car (in this case, Drive())

class BMW extends Car { // Concrete class

      // Required implementation of the abstract drive() method from Car
      // Each subclass can provide its own specific behavior
      public void drive() {
            System.out.println("Drive mode...");
      }
}

public class AbstractKeyword {

      public static void main(String a[]){

            // Cannot do: Car obj = new Car(); - This would cause a compile error
            // Instead, we create a BMW object and reference it with Car type (polymorphism)
            Car obj = new BMW();
            obj.drive();      // Calls BMW's implementation of drive()
            obj.playMusic();  // Calls the inherited playMusic() method from Car
      }
      
}
