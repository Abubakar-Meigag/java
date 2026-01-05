package enumTopic3;

enum Laptop {
      MacBook(2099), MacAir(1599), HP(799), Windows();

      private int price;

      private Laptop(){ // create default price value for the constructor who didn't have like windows
            this.price = 300;
      }

      private Laptop(int price) {
            this.price = price;
      }

      public int getPrice() {
            return price;
      }

      public void setPrice(int price) {
            this.price = price;
      }
}

public class enumTopic3 {

      public static void main(String[] args) {
            
            for(Laptop lap: Laptop.values()){

                  System.out.println(lap + ": " + lap.getPrice());
            }
      }
      
}
