import java.util.Scanner;

public class Prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int temp=num;
        int rev=0;

        while(temp>0){
            int rem=temp%10;

            rev=rev*10+rem;

            temp/=10;
        }

        if(num==rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
