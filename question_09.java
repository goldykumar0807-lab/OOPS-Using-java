//wap to show single inheritance mechanism
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    public
    String name;
    void barking(){
        System.out.print(name+" is barking.");
    }
}
public class question_09 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.name="sheru";
        d.eat();
        d.barking();
    }
    
}
