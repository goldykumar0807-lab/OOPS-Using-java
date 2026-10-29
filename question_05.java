//write a program to display the student's name, roll no and age of a student using class and object concept
class Student{
    public
    String name;
    int roll_no;
    int age;
    void display(){
        System.out.println("name of student is : "+name);
        System.out.println("roll no of student is : "+roll_no);
        System.out.print("age of student is : "+age);
    }
}
public class question_05 {
    public static void main(String[] args){
        Student s=new Student();
        s.name="goldy";
        s.roll_no=96;
        s.age=21;
        s.display();
    }
}
