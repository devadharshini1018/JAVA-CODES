abstract class payment{
    abstract void pay();
    void receipt(){
        System.out.println("Receipt generated");
    }
}
class UPI extends payment{
    void pay(){
        System.out.println("paid using UPI");
    }
}
class card extends payment{
    void pay(){
        System.out.println("paid usind card");
    }
}
public class main{
    public static void main(String[]args){
        UPI u=new UPI();
        u.receipt();
        u.pay();
    }
}
