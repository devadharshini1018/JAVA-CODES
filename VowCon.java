public class VowCon{
    public static void main(String[]args){
        int Vow=0;
        int Con=0;
        String str="Apple";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u')
            {
                Vow=Vow+1;
            }
            else{
                Con=Con+1;
            }
        }
        System.out.println("Vowels="+Vow);
        System.out.println("Consonants="+Con);
            }
            }
