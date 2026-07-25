public class patt5{
    public static void main(String[]args){
        int n=4;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
            System.out.print(" ");
            }
            for(int j=1;j<=1;j++)
            {
                System.out.print(num+" ");
                num++;
            }
        }
        System.out.println();
    }
}
