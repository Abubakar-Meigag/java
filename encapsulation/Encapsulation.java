package encapsulation;

// Naming Convention in Java
// Class names should start with Uppercase letters - Human, Encapsulation
// Interface names should start with Uppercase letters - Calc, Runnable

// Method names should start with Lowercase letters - getAge(), setName()
// Variable names should start with Lowercase letters - age, name
// Constants should be in Uppercase letters with words separated by underscores - PIE, BRAND_NAME, MAX_VALUE

// Package names should start with Lowercase letters - encapsulation, jagged
// Camel Case should be used for multi-word name - showMyName(), totalAmount, firstName

class Human {
      private int age;
      private String name;
      
      public int getAge() {
            return age;
      }
      public void setAge(int age) {
            this.age = age;
      }
      public String getName() {
            return name;
      }
      public void setName(String name) {
            this.name = name;
      }

      // public int getAge() {
      //       return age;
      // }
      
      // public String getName() {
      //       return name;
      // }
      
      // public void setAge(int a){
      //       age = a;
      // }

      // public void setName(String n){
      //       name = n;
      // }
}

public class Encapsulation {

      public static void main(String a[]) {

            Human obj = new Human();
            obj.setAge(33);
            obj.setName("Jan");

            System.out.println("My name is: " + obj.getName() + " and I'm " + obj.getAge() + " years old");
      }
}