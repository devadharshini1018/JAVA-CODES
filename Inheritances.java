class mygrandpa{
    void display(){
        System.out.println("My grandfather is a farmer");
    }
}
class mydaddy extends mygrandpa{
    void show(){
        System.out.println("My father is a bussiness man");
    }
}
class me extends mydaddy{
    void display(){
        System.out.println("I am a Doctor");
    }
}
public class Inheritance{
    public static void main(String[]args){
me obj=new me();
obj.display();
obj.show();
obj.display();
    }
}
