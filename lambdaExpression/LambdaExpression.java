package lambdaExpression;

@FunctionalInterface
interface A {

      void show(int i);

}

public class LambdaExpression {

      public static void main(String[] args) {

            // Lambda Expression. you can write with syntax like A obj = () -> {.....}
            A obj = (int i) -> System.out.println("in show " + i);
            obj.show(4);
      }

}
