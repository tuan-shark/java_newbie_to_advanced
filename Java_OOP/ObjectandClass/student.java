package Java_OOP.ObjectandClass;

public class student {
    int age;
    String name;
    public student(int age,String name){
        this.age = age;
        this.name = name;
    }
    public String out(){
        return "hello my name is " + name +" and my age is " + age;
    }
}
