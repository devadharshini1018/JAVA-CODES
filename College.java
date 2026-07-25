class college{
    void department(){
        System.out.println("Welcome to Excel Engineering college");
    }
}
class ECE extends college{
    void department(){
        System.out.println("Welcome to Electronics and communication department");
    }
}
class BME extends college{
    void department(){
        System.out.println("Welcome to Bio medical Department");
    }
}
class AI_DS extends college{
    void department(){
        System.out.println("Welcome to AI&Data structure Department");
    }
}
public class poly{
    public static void main(String[]args){
        college c=new ECE();
        c.department();
        college d=new BME();
        d.department();
        college e=new AI_DS();
        e.department();
    }
}
