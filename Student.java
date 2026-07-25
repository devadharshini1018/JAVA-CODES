class Student {
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setname (String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class Main{
    public static void main(String[]args){
        Student s=new Student();
        s.setId(101);
        s.setname("Dharshini");
        System.out.println("ID:"+s.getId());
        System.out.println("Name:"+s.getname());
    }
}
