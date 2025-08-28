//Write a Java program to use TreeSet to store student names and display them in alphabetical order.

import java.util.TreeSet;

public class Prg3 {
    public static void main(String[] args) {
        TreeSet<String> name=new TreeSet<>();

        name.add("Ravi");
        name.add("Ganesh");
        name.add("Chintu");
        name.add("Upendra");
        name.add("Ram");
        name.add("Vamshi");
        name.add("Surya");

        System.out.println(name);
    }
}
