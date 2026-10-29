//wap that shows the use of default, parameterised, copy constructor
class Student{
    public
    String name;
    int roll_no;
    int age;
    //default constructor
    Student(){

    }
    //parameterised constructor
    Student(String s,int r,int a){
        name=s;
        roll_no=r;
        age=a;
    }
    //copy constructor
    Student(Student s,int r){
        name=s.name;
        roll_no=r;
        age=s.age;
    }
    void display(){
        System.out.println("name of student is : "+name);
        System.out.println("roll no of student is : "+roll_no);
        System.out.println("age of student is : "+age);
    }
}
public class question_06 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="goldy";
        s1.roll_no=96;
        s1.age=21;
        Student s2=new Student("rahul",98,22);
        Student s3=new Student(s2,20);
        s1.display();
        s2.display();
        s3.display();
        
    }
}
