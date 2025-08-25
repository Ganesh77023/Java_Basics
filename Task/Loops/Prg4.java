//Peogram to count number of digits

import java.util.Scanner;

public class Prg4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        int count=0;

        while(num>0){
            count++;
            num/=10;
        }

        System.out.println(count);
    }
}

