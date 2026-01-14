package collectionsTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Students implements Comparable<Students>
class Students {
      int age;
      String name;

      public Students(int age, String name) {
            this.age = age;
            this.name = name;
      }

      public String toString() {
            return "Students age=" + age + ", name=" + name + " ";
      }

      // public int compareTo(Students that) {
      //       if (this.age > that.age) {
      //             return 1;
      //       }
      //       return -1;
      // }

}

public class ComparatorVsComparable {

      public static void main(String[] args) {

            Comparator<Students> com = (i, j) -> i.age > j.age ? 1 : -1;

            List<Students> studs = new ArrayList<>();
            studs.add(new Students(12, "Ali"));
            studs.add(new Students(18, "Ahmed"));
            studs.add(new Students(17, "John"));
            studs.add(new Students(22, "Bob"));
            studs.add(new Students(20, "Mike"));

            Collections.sort(studs, com);
            // Collections.sort(studs);

            for (Students s : studs) {
                  System.out.println(s);
            }

      }

}
