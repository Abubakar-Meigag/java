package dynamicMethodDispatch;

class A {
      public void show(){
            System.out.println(" in A show");
      }
}
class B extends A {
      public void show(){
            System.out.println(" in B show");
      }
}
class C extends A{
      public void show(){
            System.out.println(" in C show");
      }
}


public class DynamicMethodDispatch {

      public static void main(String a[]){

            // Reference type is A, object type is A
            // Calls A's show() method - no dynamic dispatch needed
            A obj = new A();
            obj.show();

            // Reference type is A, but object type is B (subclass)
            // Dynamic method dispatch: calls B's overridden show() at runtime
            obj = new B();
            obj.show();

            // Reference type is A, but object type is C (subclass)
            // Dynamic method dispatch: calls C's overridden show() at runtime
            obj = new C();
            obj.show();

      }
      
      
}
