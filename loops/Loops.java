package loops;

public class Loops {

      public static void main(String a[]){
            int i = 1;

            while (i <= 10){
                  System.out.println("Beko leaning Java " + i);
                  int j = 1;
                  while (j <= 5){
                        System.out.println("Inner loop " + j);
                        j++;
                  }
                  i++;
            }
      }
      
}
