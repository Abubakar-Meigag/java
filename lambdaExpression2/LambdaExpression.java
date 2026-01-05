package lambdaExpression2;

@FunctionalInterface
interface A {

      public int add(int i, int j);
}

public class LambdaExpression {

      public static void main(String[] args) {
            
            A obj = (int i, int j) -> i + j;

            int result = obj.add(3, 9);
            System.out.println(result);

      }

}
