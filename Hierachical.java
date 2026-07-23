class mydaddy{
    void display(){
        System.out.println("My father is a former");
    }
}
class mysister extends mydaddy{
    void show(){
        System.out.println("My sister is a teacher");
    }
}
class me extends mydaddy{
    void display1(){
        System.out.println("I am a freelancer");
    }
}
public class Inheritance{
    public static void main(String[]args){
        me obj=new me();
        obj.display();
        mysister sis=new mysister();
        sis.show();
        obj.display1();
    }
}
