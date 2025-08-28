// Write a Java program to demonstrate the working of HashSet by adding, removing, and displaying elements.
import java.util.HashSet;

class Prg1{
    public static void main(String[] args) {
        //Creating a HashSet to store
        HashSet<Integer> nums=new HashSet<>();

        //Adding elements
        nums.add(5);
        nums.add(null);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(3);

        System.out.print(nums);
        nums.remove(1);
        System.out.println(nums);
    }
}