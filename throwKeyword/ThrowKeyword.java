package throwKeyword;

public class ThrowKeyword {

      public static void main(String[] args) {

            int i = 20;
            int j = 0;

            try {
                  j = 8 / i;
                  if (j == 0)
                        throw new ArithmeticException("The result should be more then 0");

            } catch (ArithmeticException err) {
                  System.out.println(err);
            } catch (Exception err) {
                  System.out.println(err);
            }

            System.out.println(j);

            System.out.println("The End");
      }

}
