class Mobile {
      String brand;
      int price;
      static String type; // static variable shared among all objects of the class and belongs to the class itself

      public void show() {
            
            System.out.println("Brand name: " + brand);
            System.out.println("Price: £" + price);
            System.out.println("Type: " + type);
            System.out.println("-----------------------");
      }

      // the static method most pass the class object as parameter to access non-static members same for brand and price
      // but the static variable type can be accessed directly
      public static void printObject(Mobile obj){
            System.out.println(obj.brand + " : " + obj.price + " : " + type); 
      }
}

public class StaticMethod {

      public static void main(String a[]){
            Mobile mob = new Mobile();
            mob.brand = "Apple";
            mob.price = 1099;
            Mobile.type = "Smart Phone"; // static variable accessed using class name

            Mobile mob2 = new Mobile();
            mob2.brand = "Samsung";
            mob2.price = 799;
            Mobile.type = "Smart Phone"; // static variable shared among all objects of the class

            mob.show();
            mob2.show();

            // this way we can call the static method
            Mobile.printObject(mob);
            Mobile.printObject(mob2);
      }

}
