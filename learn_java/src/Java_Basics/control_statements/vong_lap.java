package Java_Basics.control_statements;
import java.util.Arrays;
import java.util.List;
public class vong_lap {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = a + 1;
            System.out.println(a);
        }//BASIC LOOP
        int b = 0;
        while(b<10){
            b = b + 1;
            System.out.println(b);
        }// WHILE LOOP
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x : numbers) {//FOR EACH LOOP
            System.out.print(x);
            System.out.print(",");
        }
        int x = 10;

        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );// do while loop
    }

}
