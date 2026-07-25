class Student{
    int rollno;
    String name;
    private String dept;
    private String section;
    int year;
    public String getdept(){
        return dept;
    }
    public void setdept(String section){
        this.section=section;
    }
    Student(int rollno,String name,String dept,String Section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Dept:"+dept);
        System.out.println("Section:"+section);
        System.out.println("Year:"+year);
        System.out.println();
    }
}
public class Main{
    public static void main(String[]args){
        Student[] Students=new Student[3];
        Student s1=new Student(124,"Chandru","ECE","A",2);
        Students[0]=s1;
        Student s2=new Student(102,"Dharshini","ECE","B",3);
        Students[1]=s2;
        Students[2]=new Student(103,"jeni","IT","c",1);
        Students[1].setdept("IT");
        for(int i=0;i<Students.length;i++){
            Students[i].display();
        }
    }
}
