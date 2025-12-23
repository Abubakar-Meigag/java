package operators;

public class operators {
      
      public static void main(String args[]){
            int a = 5;
            int b = 9;
            int y = 3;
            int z = 7;

            boolean checker = a < b;
            boolean checker2 = y > z;
            System.out.println(checker);
            System.out.println(checker2);

            boolean and = a > b && y > z; // false
            boolean and2 = a < b && y < z;
            System.out.println("and1 result:" + and);
            System.out.println("and2 result:" + and2);

            boolean or = a > b || y > z; // false
            boolean or2 = a < b || y < z; // true
            System.out.println("or1 result:" + or);
            System.out.println("or2 result:" + or2);

            boolean not = !(a < b); // false
            boolean not2 = !(a > b); // true
            System.out.println("not1 result:" + not);
            System.out.println("not2 result:" + not2);
            
      }
}
