package Java_OOP;

import Java_OOP.ObjectandClass.*;
import Java_OOP.Inheritance.*;
public class main {
    public static void main(String[] args) {
        Dog a = new Dog(); // AN OBJECT WHICH BE TYPE : DOG
        student b = new student(17,"tuan");
        iphone promax15 = new iphone();
        samsung ultra21 = new samsung();
        a.setAge(1);
        a.setBreed("normal");
        a.printDetails();
        System.out.println(b.out());
        promax15.refreshtion();
        ultra21.camera();
    }
}
