public class Logic {

      public static void main(String a[]) {
            int x = 9;

            if (x < 5)
                  System.out.println("that is true");
            else
                  System.out.println("that is false");

            if ( x % 3 == 0 && x % 2 == 0 ) {
                  System.out.println("x is divisible by 3 and 2");
            } else {
                  System.out.println("x is not divisible by both 3 and 2");
            }

            int num1 = 7;
            int num2 = 30;
            int num3 = 15;

            if (num1 > num2 && num1 > num3)
                  System.out.println(num1 + " is the largest number");
            else if (num2 > num3)
                  System.out.println(num2 + " is the largest number");
            else
                  System.out.println(num3 + " is the largest number");


            
            int age = 15;
            int age1 = 35;

            String result = age >= 18 ? "You are an adult" : "You are a minor";
            String result1 = age1 >= 18 ? "You are an adult" : "You are a minor";

            System.out.println(result);
            System.out.println(result1);

      }

}
