package collectionTopic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTopic {


      public static void main(String[] args) {
            
            Collection<Integer> nums = new ArrayList<Integer>();
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);

            System.out.println(nums);

            for(int n: nums){
                  System.out.println(n);
            }

            List<Integer> nums2 = new ArrayList<Integer>();

            nums2.add(1);
            nums2.add(2);
            nums2.add(3);

            System.out.println(nums2.get(1));
            System.out.println(nums2.isEmpty());
            System.out.println(nums2.hashCode());
            
      }
}
