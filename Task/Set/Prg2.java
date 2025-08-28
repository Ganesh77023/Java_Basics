//Create a LinkedHashSet and show how it maintains the insertion order.

import java.util.LinkedHashSet;

public class Prg2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums=new LinkedHashSet<>();

        nums.add(5);
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
    }
}
