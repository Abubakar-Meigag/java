package conversion;

public class con {
      
      public static void main(String args[]){

            byte By = 10;
            int it = (int)By;
            System.out.println(it); // you can assign byte to int without casting just conversion

            int in = 129;
            byte by = (byte) in; // explicit casting from int to byte
            System.out.println(by); // overflow occurs here, prints -127

            // Different types of type conversions in Java

            // Implicit Conversion (Widening)
            int intValue = 100;
            double doubleValue = intValue; // int to double
            System.out.println("Implicit Conversion:");
            System.out.println("Integer value: " + intValue);
            System.out.println("Converted to Double: " + doubleValue);
            System.out.println("#############################");

            // Explicit Conversion (Narrowing)
            double anotherDoubleValue = 99.99;
            int anotherIntValue = (int) anotherDoubleValue; // double to int
            System.out.println("\nExplicit Conversion:");
            System.out.println("Double value: " + anotherDoubleValue);
            System.out.println("Converted to Integer: " + anotherIntValue);
            System.out.println("#############################");

            // String to Integer Conversion
            String strNumber = "12345";
            int parsedInt = Integer.parseInt(strNumber);
            System.out.println("\nString to Integer Conversion:");
            System.out.println("String value: " + strNumber);
            System.out.println("Parsed Integer: " + parsedInt);
            System.out.println("#############################");

            // Integer to String Conversion
            int num = 6789;
            String strFromInt = Integer.toString(num);
            System.out.println("\nInteger to String Conversion:");
            System.out.println("Integer value: " + num);
            System.out.println("Converted String: " + strFromInt);

      }
}
