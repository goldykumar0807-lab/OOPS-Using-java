//write a programme for swapping two numbers
import java.util.Scanner;
public class question_02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of a : ");
        int a=sc.nextInt();
        System.out.print("enter value of b : ");
        int b=sc.nextInt();
        //swapping both numbers
        int temp=a;
        a=b;
        b=temp;
        System.out.print("a = "+a+" and "+"b = "+b);
        sc.close();
    }
}
