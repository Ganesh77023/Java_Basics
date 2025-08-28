//Q4. Write a program to check the difference between HashSet and TreeSet in terms of performance.
import java.util.*;

public class Prg4 {
    public static void main(String[] args) {
        int n = 1_00000; // number of elements (1 lakh)
        
        // ---------- HashSet ----------
        Set<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add in HashSet: " + (endTime - startTime) / 1e6 + " ms");
        
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to search in HashSet: " + (endTime - startTime) / 1e6 + " ms");
        
        
        // ---------- TreeSet ----------
        Set<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to add in TreeSet: " + (endTime - startTime) / 1e6 + " ms");
        
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            treeSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to search in TreeSet: " + (endTime - startTime) / 1e6 + " ms");
    }
}
