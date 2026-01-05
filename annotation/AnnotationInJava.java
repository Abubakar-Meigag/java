package annotation;

class A {

      public void showInThisClass(){
            System.out.println("show in A");
      }
}

class B extends A {

      // Annotations in Java are metadata that provide information about the code to the compiler or runtime.
      // They start with @ symbol and can be applied to classes, methods, fields, parameters, etc.
      @Override
      public void showInThisClass(){
            System.out.println("show in B");
      }
}

public class AnnotationInJava {

      public static void main(String[] args) {
            
            B obj = new B();
            obj.showInThisClass();
      }
      
}
