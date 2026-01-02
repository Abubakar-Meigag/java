package abstractAndAnonymous;

abstract class A {

      public abstract void show();
      public abstract void config();

}

public class AbstractAndAnonymous {

      public static void main(String a[]) {

            A obj = new A(){

                  public void show() {
                        System.out.println("in Anonymous inner class");
                  }

                  public void config(){
                        System.out.println("in config");
                  }
            };

            obj.show();
            obj.config();

      }

}
