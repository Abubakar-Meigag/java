package toStringClass;


class Laptop {

      public String model;
      public int price;
      
      
      @Override
      public String toString() {
            return "Laptop [model=" + model + ", price=" + price + "]";
      }


      @Override
      public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            result = prime * result + price;
            return result;
      }


      @Override
      public boolean equals(Object obj) {
            if (this == obj)
                  return true;
            if (obj == null)
                  return false;
            if (getClass() != obj.getClass())
                  return false;
            Laptop other = (Laptop) obj;
            if (model == null) {
                  if (other.model != null)
                        return false;
            } else if (!model.equals(other.model))
                  return false;
            if (price != other.price)
                  return false;
            return true;
      }
}

public class ToStringClass {

      public static void main(String a[]){

            Laptop obj = new Laptop();
            obj.model = "Apple MacBook Pro";
            obj.price = 2099;

            Laptop obj2 = new Laptop();
            obj2.model = "Apple MacBook Pro";
            obj2.price = 2099;
            
            Laptop obj3 = new Laptop();
            obj3.model = "Apple MacBook Air";
            obj3.price = 2099;

            boolean result  = obj.equals(obj2);
            boolean result2 = obj.equals(obj3);

            System.out.println(result);
            System.out.println(result2);
      }
      
}

/*
 * SUMMARY OF CONCEPTS LEARNED:
 *
 * 1. toString() Method:
 *    - Overrides the default toString() from Object class
 *    - Returns a human-readable string representation of the object
 *    - Useful for debugging and displaying object state
 *    - Default Object.toString() returns classname@hashcode (not very helpful)
 *    - Custom toString() shows actual field values in a readable format
 *
 * 2. hashCode() Method:
 *    - Overrides the default hashCode() from Object class
 *    - Returns an integer hash value for the object
 *    - Used in hash-based collections (HashMap, HashSet, etc.)
 *    - Prime number (31) is used for better distribution of hash values
 *    - Should be consistent with equals() - equal objects MUST have same hashCode
 *    - Combines hash values of all significant fields
 *
 * 3. equals() Method:
 *    - Overrides the default equals() from Object class
 *    - Determines if two objects are logically equal (not just same reference)
 *    - Default Object.equals() only checks reference equality (==)
 *    - Custom equals() checks if field values are the same
 *    - Steps:
 *      a) Check if same reference (this == obj)
 *      b) Check if null
 *      c) Check if same class type
 *      d) Cast and compare each field
 *
 * 4. Important Contract:
 *    - If you override equals(), you MUST override hashCode()
 *    - Equal objects must have equal hash codes
 *    - This ensures correct behavior in collections
 *
 * 5. Practical Use:
 *    - obj and obj2 have same values → equals() returns true
 *    - obj and obj3 have different model → equals() returns false
 *    - Without custom equals(), both would return false (different references)
 */


