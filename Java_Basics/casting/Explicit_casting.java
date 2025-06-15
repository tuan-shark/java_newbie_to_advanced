package Java_Basics.casting;

public class Explicit_casting {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 11.5;
        double sum = num1 + num2;
        int sum1 = (int) sum;
        System.out.println(sum1);
    }
}
