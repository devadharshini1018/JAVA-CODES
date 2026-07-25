class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat meows");
    }
}
public class Main{
    public static void main(String[]args){
        Animal a=new Dog();
        a.sound();
        Animal a1=new cat();
        a1.sound();
    }
}
