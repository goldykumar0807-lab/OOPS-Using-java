//write a program to display addition of two integers
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first integer : ");
        int a=sc.nextInt();
        System.out.print("enter second integer : ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("sum = "+sum);
        sc.close();
    }
}
