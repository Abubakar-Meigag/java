package finalKeyword;


// here we can add final keyword to the class like "final class Calc" then no one can inherit or extends this class
class Calc {

      public final void show() {
            System.out.println(" by Beko");
      }

      // here after we create n4 as final int we can't modify or edit n value because, final it work as const
      public final int n4 = 9;

      public void add(int n1, int n2) {
            System.out.println(n1 + n2);
      }
}

class AdvCalc extends Calc {

      
      // public void show(){}; 
      // here after we create show method as final we can't modify or override that method because it have final keyword

      // but we can override add method - and this is work because doesn't have final
      // keyword
      public void add(int n1, int n2) {
            System.out.println(n1 + n2 + 5);
      }
}

public class FinalKeyword {

      public static void main(String a[]) {

            // here after we create n as final int we can't modify or edit n value because final
            // it work as const
            final int n = 9;
            System.out.println(n);

            Calc obj = new Calc();
            obj.add(3, 2);

      }
}
