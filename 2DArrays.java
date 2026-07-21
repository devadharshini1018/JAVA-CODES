public class Students{
    public static void main(String[] args) {
        String[]name={"abu","ajay","abi","akash"};
        int[][]mark={{60,76,98,76,65},{54,74,96,85,64},{96,87,74,63,91},{54,87,65,94,91}};
        for(int i=0;i<name.length;i++)
        {
            System.out.println("Name="+name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
        System.out.println(mark[i][j]+" ");
        total=mark[i][j];
        }
        System.out.println();
        System.out.println("Average:"+(total/5)+"%");
        System.out.println();
    }
}
}
