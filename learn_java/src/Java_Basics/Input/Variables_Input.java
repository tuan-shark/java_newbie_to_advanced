package Java_Basics.Input;
import java.util.Scanner;
public class Variables_Input {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
        int songuyen = doc.nextInt();
        System.out.println(songuyen);
        float sophay = doc.nextFloat();
        System.out.println(sophay);
        doc.nextLine();
        String chuoi1 = doc.nextLine();
        System.out.println(chuoi1);
    }
}
