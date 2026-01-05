package functional;

/*
- A functional interface can only have exactly one abstract method
- The @FunctionalInterface annotation enforces this rule at compile-time
- Your interface A already has one abstract method: void show();
- If you uncomment void run();, the compiler will throw an error because the interface would have two abstract methods, violating the functional interface contract
*/

@FunctionalInterface
interface A {

      void show();
      // here we getting error coz of the annotation Functional interface which accepting only one method
      // void run(); 
}

// class B implements A {
//       public void show() {
//             System.out.println("show in B");
//       }
// }

public class FunctionalInterfaceDemo {

      public static void main(String[] args) {

            A obj = new A() {

                  public void show() {
                        System.out.println("in show");
                  }
            };
            obj.show();

      }

}
