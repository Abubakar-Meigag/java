package boxingAndUnBoxing;

// Boxing: converting primitive (int) to wrapper object (Integer).
// Unboxing: converting wrapper object (Integer) back to primitive (int)
// Parsing: converting String to primitive integer using Integer.parseInt()

public class Boxing {

      public static void main(String a[]){


            int num1 = 8;
            Integer nums1 = num1;  // autoBoxing
            System.out.println(nums1);

            int num2 = nums1; // auto-unboxing
            System.out.println(num2);

            String num3 = "10";
            int nums3 = Integer.parseInt(num3); // parsing 
            System.out.println(nums3 / 2);


      }
      
}
