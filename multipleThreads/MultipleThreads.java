package multipleThreads;

class A extends Thread {

      public void run() {

            int i = 0;
            while (i < 100) {
                  System.out.println("hi");
                  try {
                        Thread.sleep(10);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  i++;
            }
      }
}

class B extends Thread {

      public void run() {
            int i = 0;
            while (i < 100) {
                  System.out.println("hello");
                  try {
                        Thread.sleep(10);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  i++;
            }
      }
}

public class MultipleThreads {

      public static void main(String[] args) {

            A obj1 = new A();
            B obj2 = new B();

            obj1.start();
            obj2.start();
      }
}
