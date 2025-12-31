package codeWars;
import java.util.Arrays;

public class JadenCasingString {

      public String toJadenCase(String phrase) {

            if (phrase == null) {
                  return null;
            }

            if (phrase.isEmpty()) {
                  return null;
            }

            for (int i = 0; i < phrase.length(); i++) {
                  if (i == 0 || phrase.substring(i - 1, i).equals(" ")) {

                        String before = phrase.substring(0, i);
                        String here = phrase.substring(i, i + 1).toUpperCase();
                        String after = phrase.substring(i + 1);
                        phrase = before + here + after;
                  }
            }
            return phrase;
      }

      public static void main(String a[]) {


            // test how to convert text into array also to see into array you must import 'Array' lib  then you able to check it 
            String str = "How can mirrors be real if our eyes aren't real";
            String[] d = str.split(" ");

            System.out.println(Arrays.toString(d));

            for (String s : d) {
                  System.out.println(s);
            }
      }
}
