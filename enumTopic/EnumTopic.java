package enumTopic;

/**
 * WHAT IS ENUM?
 * =============
 * - Enum is a special Java type that defines a fixed set of named constants
 * - More powerful and type-safe than using integers or strings for constants
 * - Declared using the 'enum' keyword
 * - Each enum constant is implicitly public, static, and final
 *
 * WHY USE ENUM?
 * =============
 * - Type Safety: Compiler ensures only valid values are used
 * - Readability: Named constants are more meaningful than magic numbers
 * - Maintainability: Changes are centralized in one place
 */


enum Status {
      Failed, Running, Pending, Success;
}

public class EnumTopic {

      public static void main(String args[]) {

            // Assigning enum constants to variables
            // Each constant is a unique instance of the Status enum
            Status r = Status.Running;
            Status f = Status.Failed;
            Status p = Status.Pending;
            Status s = Status.Success;

            // Printing enum constants - displays their names as strings
            System.out.println(r);
            System.out.println(f);
            System.out.println(p);
            System.out.println(s);

            System.out.println("############################");

            // values() - Built-in method that returns all enum constants as an array
            // This method is automatically generated for every enum
            Status[] ss = Status.values();

            // Iterating through all enum constants
            // ordinal() - Returns the position (0-based index) of the enum constant
            for(Status e: ss){
                  System.out.println(e + ": " + e.ordinal());
            }

            /**
             * KEY ENUM METHODS:
             * ================
             * - values(): Returns array of all enum constants
             * - ordinal(): Returns the position (index) of the constant
             * - name(): Returns the name of the constant as a string
             * - valueOf(String): Converts string to corresponding enum constant
             */
      }

}
