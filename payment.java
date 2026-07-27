/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class payment{
    protected double amount;
    payment (double amount){
        this.amount=amount;
    }
        abstract void pay();
        void receipt(){
            System.out.println("Receipt generated");
            System.out.println("Amount paid:$"+amount);
        }
        void showpaymentstatus(){
            System.out.println("payment sucessful");
        }
    }
    class upipayment extends payment{
        private String upiid;
        upipayment(double amount,String upiid){
            super(amount);
            this.upiid=upiid;
        }
    
    void pay(){
        System.out.println("Processing upipayment");
        System.out.println("upiid:"+upiid);
    }
    }
    class cardpayment extends payment{
        private String cardnumber;
        cardpayment(double amount,String upiid){
            super(amount);
            this.cardnumber=cardnumber;
        }
        void pay(){
            System.out.println("processing card payment...");
            System.out.println("cardnumber:**** **** ****");
            
        }
    }
    public class main{
        public static void main(String[]args){
            payment p1=new upipayment(550.75,"jeeva@oksbi");
            payment p2=new cardpayment(1250.50,"1234567812345678");
            p1.pay();
            p1.receipt();
            p1.showpaymentstatus();
            System.out.println();
            p2.pay();
            p2.receipt();
            p2.showpaymentstatus();
            
        }
    }
    
