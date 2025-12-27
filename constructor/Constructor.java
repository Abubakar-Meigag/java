package constructor;

class Human {
      private int age;
      private String name;

      // Constructor is defined here to initialize default values
      // when an object of Human class is created
      // Constructor name is same as class name and it has no return type
      // This is a no-argument constructor and it sets default values which can be changed later
      // Constructors always called as many times as objects are created
      // If no constructor is defined, Java provides a default no-argument constructor
      // but if we define any constructor, the default one is not provided
      public Human() { //  <-- default Constructor
            age = 12;
            name = "by default name";
      }

      public Human(int age, String name) { // <-- parameterized Constructor
            this.age = age;
            this.name = name;
      }
      
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
}

public class Constructor {

      public static void main(String a[]){

            Human obj = new Human();  // here we create one object of Human class that mean the constructor is called once only
            System.out.println("My name is: " + obj.getName() + " and I'm " + obj.getAge() + " years old");
            // obj.setAge(30);      // here we resign the age value in the object that defined in the class and constructor
            // obj.setName("Bob"); // here we resign the name value in the object that defined in the class and constructor
            
            Human obj2 = new Human(25, "Alice"); // here we create another object of Human class with parameterized constructor
            System.out.println("My name is: " + obj2.getName() + " and I'm " + obj2.getAge() + " years old");
      }
}
