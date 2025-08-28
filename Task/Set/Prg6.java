//Q6. Write a program that finds the union, intersection, and difference between two sets.

import java.util.Arrays;
import java.util.HashSet;

public class Prg6 {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(5,6,7,8,9));

        //Union
        set1.addAll(set2);
        System.out.println(set1);

        HashSet<Integer> set3=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set4=new HashSet<>(Arrays.asList(5,6,7,8,9));

        //Intersection
        set3.retainAll(set4);
        System.out.println(set3);

        HashSet<Integer> set5=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set6=new HashSet<>(Arrays.asList(5,6,7,8,9));
        
        //Difference
        set5.removeAll(set6);
        System.out.println(set5);
    }
}
