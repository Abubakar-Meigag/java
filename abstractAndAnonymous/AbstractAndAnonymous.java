package abstractAndAnonymous;

abstract class A {

      public abstract void show();

}

public class AbstractAndAnonymous {

      public static void main(String a[]) {

            A obj = new A(){

                  public void show() {
                        System.out.println("in Anonymous inner class");
                  }
            };

            obj.show();

      }

}
