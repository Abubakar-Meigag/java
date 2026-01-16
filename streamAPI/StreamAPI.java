package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

      public static void main(String[] args) {

            List<Integer> num = Arrays.asList(2, 5, 8, 7, 4, 6, 9);

            Stream<Integer> s = num.stream();
            Stream<Integer> s2 = s.filter(n -> n % 2 == 0);
            Stream<Integer> s3 = s2.map(n -> n * 2);
            int res = s3.reduce(0, (a, b) -> a + b);
            System.out.println(res);

            int e = num.stream()
                        .filter(n -> n % 2 != 0)
                        .map(n -> n * 3)
                        .reduce(0, (a, b) -> a + b);
            System.out.println(e);

            // s3.forEach(n -> System.out.println(n));

      }

}
