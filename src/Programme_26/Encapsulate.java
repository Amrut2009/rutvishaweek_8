package Programme_26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;
    public void setName(String name){
        this.name =name;
    }
    public void setRollNo(int rollNo){
        this.rollNo =rollNo;
    }
    public String setAge(int age ) {
        this.age = age;
        return null;
    }
    public String getName(){
        return  name;
    }
    public  int getRollNo(){
        return  rollNo;
    }
    public  int getAge(){
        return  age;

    }
}
