package throwsKeyword;

/*
 * The 'throws' keyword in Java:
 *
 * The 'throws' keyword is used in method signatures to declare that a method might throw one or more exceptions.
 * This is part of Java's checked exception handling mechanism.
 *
 * Use Cases:
 * 1. Delegating Exception Handling: When you don't want to handle the exception in the current method,
 *    you can use 'throws' to pass the responsibility to the calling method.
 *
 * 2. Checked Exceptions: Required for checked exceptions (like IOException, ClassNotFoundException)
 *    that must be either caught or declared.
 *
 * 3. Multiple Exceptions: You can declare multiple exceptions separated by commas
 *    Example: public void method() throws IOException, SQLException
 *
 * 4. Documentation: Informs callers about potential exceptions they need to handle
 *
 * Syntax: returnType methodName(parameters) throws ExceptionType1, ExceptionType2 { }
 *
 * Note: The calling method must either handle these exceptions with try-catch or declare them with throws.
 */

class A {

      public void show() throws ClassNotFoundException {

            Class.forName("User");
      }
}

public class ThrowsKeyword {

      public static void main(String[] args) {

            A obj = new A();
            try {
                  obj.show();
            } catch (ClassNotFoundException e) {
                  e.printStackTrace();
                  System.out.println("Class not found: " + e);
            }
      }
}
