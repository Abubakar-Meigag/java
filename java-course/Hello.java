
class Hello {
      public static void main(String a[]) {
            int num1 = 10;
            int num2 = 20;
            int sum = num1 + num2;

            // Data types in Java
            
            // integral types
            byte by = 121; // byte range is -128 to 127
            short sh = 3333; // short range is -32,768 to 32,767
            int in = 123456; // int range is -2,147,483,648 to 2,147,483,647
            long lo = 123456789L; // long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            
            // floating point types
            float fl = 12.34f; // float range is approximately ±3.40282347E+38F (6-7 significant decimal digits)
            double db = 12.3456789; // double range is approximately ±1.79769313486231570E+308 (15 significant decimal digits)
            
            // character and boolean types
            char ch = 'A'; // char range is 0 to 65,535 (Unicode values) with single quotes
            boolean bool = true; // boolean values are true or false


            System.out.println("integral types:");
            System.out.println("byte: " + by);
            System.out.println("short: " + sh);
            System.out.println("int: " + in);
            System.out.println("long: " + lo);
            System.out.println("#############################");
            System.out.println("floating point types:");
            System.out.println("float: " + fl);
            System.out.println("double: " + db);
            System.out.println("#############################");
            System.out.println("character and boolean types:");
            System.out.println("char: " + ch);
            System.out.println("boolean: " + bool);

            System.out.println("#############################");
            System.out.println("Hello, World!");
            System.out.println("The sum of num1 and num2 is: " + sum);
      }
}