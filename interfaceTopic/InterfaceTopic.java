package interfaceTopic;

interface A {

      // when you define variables into the interface it become by default final and static 
      String city = "London";  // it final and static 
      int    age  = 32;       // final and static 

      void show();
      void config();
}

class B implements A {

      public void show(){
            System.out.println("in show");
      }

      public void config(){
            System.out.println("in config");
      }
}

public class InterfaceTopic {

      public static void main(String a[]){

            A obj;
            obj = new B();
            obj.show();
            obj.config();
            
            System.out.println(A.city);
            System.out.println(A.age);
      }
      
}
