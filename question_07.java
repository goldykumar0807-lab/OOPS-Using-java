
class Student {
    String name;
    static int count;

    // Static block
    static {
        count = 0;
        System.out.println("Static block executed");
    }

    // Constructor
    Student(String n) {
        name = n;
        count++;
    }

    // Static member function
    static void displayCount() {
        System.out.println("Total students: " + count);
    }

    // Instance method
    void display() {
        System.out.println("Student name: " + name);
    }
}

public class question_07 {
    public static void main(String[] args) {
        Student s1 = new Student("Goldy");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();

        Student.displayCount();
    }
}
