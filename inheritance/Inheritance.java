package inheritance;

public class Inheritance {

      public static void main(String a[]){

            VeryAdvCalc obj = new VeryAdvCalc();

            int    r1 = obj.add(3, 2);
            int    r2 = obj.sub(6, 5);
            int    r3 = obj.multi(10, 9);
            int    r4 = obj.div(15, 5);
            double r5 = obj.powerOfNumber(r1, r4);

            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);
            System.out.println(r5);
      }
}
