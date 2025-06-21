package Java_Basics.variables;

public class InstanceVariables{
    int Instance1 = 1;
    int Instance2 = 2; 
    public static void main(String []args){
        InstanceVariables test = new InstanceVariables();
        System.out.println(test.Instance1);
        System.out.println(test.Instance2);
    }
}