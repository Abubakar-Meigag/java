package thisAndSuper;

class A {

      public A() { // constructor
            super();
            System.out.println("in A");
      }

      public A(int n) { // constructor parameter
            super();
            System.out.println("in A int");
      }
}

class B extends A {
      public B() { // constructor
            super();
            System.out.println("in B");
      }

      public B(int n) { // constructor parameter
            this();
            System.out.println("in B int");
      }
}

public class ThisAndSuper {
      public static void main(String a[]) {

            B obj = new B(7);
      }

}
