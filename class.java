class student{
    int rollno;
    String name;
    String dept;
    String Section;
    int year;
student(int rollno,String name,String dept,String Section,int year){
    this.rollno=rollno;
    this.name=name;
    this.dept=dept;
    this.Section=Section;
    this.year=year;
}
void display(){
    System.out.println("rollno:"+rollno);
     System.out.println("name:"+name);
      System.out.println("dept:"+dept);
       System.out.println("Section:"+Section);
        System.out.println("year:"+year);
        System.out.println();
}
}
public class Main{
    public static void main(String[]args){
        student[]students=new student[3];
        student s1=new student(24,"Devil","ECE","A",4);
        students[0]=s1;
        student s2=new student(126,"Chandru","ECE","A",3);
        students[1]=s2;
        students[2]=new student(48,"Jeni","EEE","B",3);
        for(int i=0;i<students.length;i++){
            students[i].display();
        }
    }
}
