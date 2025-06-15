package Java_Basics.variables;

public class LocalVariables {
    public void test() {
        int a = 0;
        a = a + 1;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVariables test = new LocalVariables();
        test.test();
    }
}
