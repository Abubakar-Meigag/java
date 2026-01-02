package innerClass;


// This is a regular outer class A
class A {

      int age;

      public void show() {
            System.out.println("in show");
      }

      /**
       * INNER CLASS (Non-Static)
       * - Defined inside outer class without 'static' keyword
       * - Has access to all members of outer class (including private)
       * - Cannot exist without an instance of outer class
       * - Can access outer class instance variables like 'age'
       * - Must be instantiated using: outerObject.new InnerClass()
       */
      class B {
            public void config() {
                  System.out.println("in config");
                  // Can access outer class members: age, show(), etc.
            }

      }

      /**
       * STATIC NESTED CLASS
       * - Defined inside outer class with 'static' keyword
       * - Does NOT have access to outer class instance members
       * - Can exist independently without outer class instance
       * - Can only access static members of outer class
       * - Instantiated like: new OuterClass.StaticNestedClass()
       * - Behaves like a regular class, just nested for organization
       */
      static class C {
            public void inStatic() {
                  System.out.println("in static");
                  // Cannot access outer class instance members like 'age'
            }
      }
}

/**
 * INNER CLASS DEMONSTRATION
 *
 * There are two types of inner classes in Java:
 * 1. Non-static inner class (regular inner class)
 * 2. Static nested class
 *
 * Key Differences:
 * - Non-static inner class needs outer object, static nested class doesn't
 * - Non-static can access outer instance members, static cannot
 * - Instantiation syntax is different for each type
 */
public class InnerClassTopic {

      public static void main(String a[]) {

            // STEP 1: Create outer class object
            // This is required before creating non-static inner class
            A obj = new A();
            obj.show();

            // STEP 2: Create NON-STATIC INNER CLASS object
            // Syntax: OuterClass.InnerClass variableName = outerObject.new InnerClass();
            // - Must use existing outer object (obj)
            // - Use special syntax: obj.new B()
            // - Inner class B is tied to this specific 'obj' instance
            // - Can access obj's instance variables and methods
            A.B obj1 = obj.new B();
            obj1.config();

            // STEP 3: Create STATIC NESTED CLASS object
            // Syntax: OuterClass.StaticClass variableName = new OuterClass.StaticClass();
            // - Does NOT need outer class object
            // - Use regular 'new' syntax with class path: new A.C()
            // - Independent of any outer class instance
            // - Cannot access outer class instance members
            A.C obj3 = new A.C();
            obj3.inStatic();

            /**
             * SUMMARY:
             *
             * Non-static inner class (B):
             *   - Instantiation: outerObj.new InnerClass()
             *   - Requires: Outer class instance
             *   - Access: All outer class members
             *
             * Static nested class (C):
             *   - Instantiation: new OuterClass.StaticClass()
             *   - Requires: Nothing (independent)
             *   - Access: Only static outer class members
             */
      }

}
