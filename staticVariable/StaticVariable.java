package staticVariable;

class Mobile {
      String brand;
      int price;
      static String type; // static variable shared among all objects of the class and belongs to the class itself

      public void show() {
            // System.out.println(brand + " : " + price + " : " + type);
            System.out.println("Brand name: " + brand);
            System.out.println("Price: £" + price);
            System.out.println("Type: " + type);
            System.out.println("-----------------------");
      }
}

public class StaticVariable {

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
      }

}
