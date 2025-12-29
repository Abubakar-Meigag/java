package overriding;

class Calc {

      public int add(int n1, int n2) {
            return n1 + n2;
      }
}

class AdvCalc extends Calc {

      // here we overriding the add() method on the Calc class 
      public int add(int n1, int n2) {
            return n1 + n2 + 2;
      }
}

public class Overriding {

      public static void main(String a[]) {

            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(2, 6);

            System.out.println(r1);

      }

}
