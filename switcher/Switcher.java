package switcher;

public class Switcher {

      public static void main(String a[]){

            int day = 4;

            switch(day){
                  case 1:
                        System.out.println("Monday");
                        break;
                  case 2:
                        System.out.println("Tuesday");
                        break;
                  case 3:
                        System.out.println("Wednesday");
                        break;
                  case 4:
                        System.out.println("Thursday");
                        break;
                  case 5:
                        System.out.println("Friday");
                        break;
                  case 6:
                        System.out.println("Saturday");
                        break;
                  case 7:
                        System.out.println("Sunday");
                  default:
                        System.out.println("Invalid day");
            }


            String workDays = "Sunday";

            switch (workDays){
                  case "Saturday", "Sunday" -> System.out.println("It's a weekend");
                  case "Monday" -> System.out.println("Weak up at 8 AM");
                  default -> System.out.println("Weak up at 7 AM");
            }


            String checkWorkDay = "Tuesday";
            String result;

            result = switch (checkWorkDay) {
                  case "Saturday", "Sunday" -> "It's a weekend";
                  case "Monday" -> "Weak up at 8 AM";
                  default -> "Weak up at 7 AM";
            };

            System.out.println(result);

      }
      
}
