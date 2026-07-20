import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(
            System.in);
        int[]marks={70,80,90,60,50};
        int num=sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==num)
            {
                System.out.println("Number found");
                return;
            }
        }
        System.out.println("Number not found");
    }
}
