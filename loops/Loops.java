package loops;

public class Loops {

      public static void main(String a[]) {
            // while loop
            int i = 1;

            while (i <= 3) {
                  System.out.println("Beko leaning Java " + i);
                  int j = 1;
                  while (j <= 2) {
                        System.out.println("Inner loop " + j);
                        j++;
                  }
                  i++;
            }

            // do while loop
            // use case is when you want to execute the loop at least once even in the
            // condition is false
            int k = 4;

            do {
                  System.out.println("Do-While loop iteration " + k);
                  k++;
            } while (k <= 3); // here condition is false but loop will execute once

            // for loop
            for (int f = 0; f <= 6; f += 2) {
                  System.out.println("Beko learning for loop in Java " + f);
            }
      }

}
