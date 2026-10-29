//write a program to print all prime numbers between 100 to 200
public class question_03 {
    public static void main(String[] args){
        System.out.print("all prime numbers between 100 to 200 : ");
        for(int i=100;i<=200;i++){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag==true){
                System.out.print(i+" ");
            }
        }
    } 
}
