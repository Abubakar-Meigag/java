package collectionTopic;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTopic {

      public static void main(String[] args) {

            Set<Integer> nums = new HashSet<Integer>();
            nums.add(82);
            nums.add(42);
            nums.add(22);
            nums.add(12);
            nums.add(62);

            for (int n : nums) {
                  System.out.println(n);
            }

            Collection<Integer> nums2 = new TreeSet<Integer>();
            nums2.add(82);
            nums2.add(42);
            nums2.add(22);
            nums2.add(12);
            nums2.add(62);

            System.out.println("################# Set with sorted elements");
            for (int n : nums2) {
                  System.out.println(n);
            }

            System.out.println("################# Set with Iterator");

            Iterator<Integer> val = nums2.iterator();

            while (val.hasNext()) {
                  System.out.println(val.next() + " from iterator");
            }
      }

}
