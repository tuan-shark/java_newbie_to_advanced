package Java_OOP.ObjectandClass;

public class Dog {//NORMAL CLASS : DOG
    String name;
    String breed;
    int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printDetails() {
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
    }
}
