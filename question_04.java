//write a program to check a number is palindrome or not
import java.util.Scanner;
public class question_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n =sc.nextInt();
        String s=Integer.toString(n);
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.print("number is palindrome.");
        else System.out.print("number is not a palindrome.");
        sc.close();
    }
}
