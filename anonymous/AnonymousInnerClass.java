package anonymous;

class A {

      public void show(){
            System.out.println("in show");
      }
}

public class AnonymousInnerClass {
      
      public static void main(String a[]){

            A obj = new A(){
                  public void show(){ 
                        // this is an anonymous inner class
                        // overriding show() method that in A class and give it new output 
                        System.out.println("in new show");
                  }
            };
            obj.show();
      }
}
