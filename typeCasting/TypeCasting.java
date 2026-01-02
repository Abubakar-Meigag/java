package typeCasting;

// Type Casting in Java:
// 1. Process of converting one data type to another
// 2. In inheritance, allows treating objects as different types in the hierarchy
// 3. Two types: Upcasting (implicit) and Downcasting (explicit)

// Upcasting:
// - Converting subclass reference to superclass reference
// - Happens automatically (implicit)
// - Always safe and no casting syntax required
// - Restricts access to only superclass methods
// - Example: A obj = new B(); (B is upcast to A)

// Downcasting:
// - Converting superclass reference back to subclass reference
// - Must be done explicitly with casting syntax
// - Can throw ClassCastException if object isn't actually of the target type
// - Allows access to subclass-specific methods
// - Example: B obj1 = (B)obj; (A is downcast to B)

class A {
      public void show1() {
            System.out.println("show A");
      }
}

class B extends A {
      public void show2() {
            System.out.println("show B");
      }
}

public class TypeCasting {

      public static void main(String a[]) {

            // Upcasting
            // here A is the reference type and B is the object type
            A obj = new B();
            obj.show1();

            // Downcasting
            // here B is the reference type and obj (originally type A) is explicitly cast
            // to B
            B obj1 = (B) obj;
            obj1.show2();

      }

}
