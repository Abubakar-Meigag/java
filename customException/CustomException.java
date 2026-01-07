package customException;

class MyException extends RuntimeException {

      // this class must extend either Exception or RunTimeException to work and add super to call your string as pram 
      public MyException(String str) {
            super(str);
      }
}

public class CustomException {

      public static void main(String[] args) {

            int i = 20;
            int j = 0;

            try {
                  j = 8 / i;
                  if (j == 0);
                        throw new MyException("The result should be more then 0");

            } catch (MyException err) {
                  System.out.println(err);
            } catch (Exception err) {
                  System.out.println(err);
            }

            System.out.println(j);

            System.out.println("The End");
      }

}
