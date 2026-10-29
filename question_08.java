//wap tp show method overloading and overriding
class operations{
    public
    int a;
    int b;
    int c;
    int add(int a, int b){
        return a+b;
    }
    int add(int a ,int b, int c){
        return a+b+c;
    }
}
class division extends operations{
    //method overriding
    int d;
    int e;
    int add(int e, int d ){
        return e+d;
    }
}
public class question_08{
    public static void main(String[] args){
        operations o=new operations();
        System.out.println(o.add(20,30));
        System.out.println(o.add(20,30,40));
        division d=new division();
        System.out.println(d.add(50,60));
    }
}
