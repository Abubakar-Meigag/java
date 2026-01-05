package lambdaExpression;

@FunctionalInterface
interface A {

      void show();

}

public class LambdaExpression {

      public static void main(String[] args) {

            // Lambda Expression. you can write with syntax like A obj = () -> {.....}
            A obj = () -> {
                  System.out.println("in show");
            };

            obj.show();
      }

}
