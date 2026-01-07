package exceptionHandling;

public class ExceptionHandling {

      public static void main(String[] args) {

            int i = 2;
            int j = 0;

            int num[] = new int[5];
            String str = null;

            try {
                  j = 12 / i;
                  System.out.println(str.length());
                  System.out.println("Value of second index in the array = " + num[1]);
                  System.out.println("Value of last index in the array = " + num[5]);
            } catch (ArithmeticException err) {
                  System.out.println("Something went wrong..!! " + err);
            } catch (ArrayIndexOutOfBoundsException err) {
                  // here we can add "catch" as much we need to handle multiple errors
                  System.out.println(err);
            } catch (Exception err){
                  // Exception Class must be the last catch statement because it is the parent class of all other exception
                  System.out.println(err);
            }

            System.out.println(j);
            System.out.println("The End");

      }

}
