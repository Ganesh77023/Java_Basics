//Q5. Create a program that removes duplicate elements from a List using a Set.

import java.util.*;

public class Prg5 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,7,8,1,2,4,5,6,3,9);

        System.out.println(list);

        HashSet<Integer> nums=new HashSet<>(list);

        System.out.println(nums);
    }
}
