package collectionTopic;

import java.util.HashMap;
import java.util.Map;

public class MapTopic {
     
      
      public static void main(String[] args) {
            
            Map<String, Integer> students = new HashMap<String,Integer>();

            students.put("Jon", 56);
            students.put("Bob", 78);
            students.put("Alan", 94);
            students.put("Ali", 90);

            for(String str: students.keySet()){
                  System.out.println(str + ": " + students.get(str));
            }

      }
}
