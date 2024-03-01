import java.util.Scanner;

public class less1 {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 1;
        for (int sum = 0; sum <= 100; sum++) {

            sum = x1 + x2;

            x1 = x2;
            x2 = sum;

            System.out.println(sum);
        }







    }
}
//1-f? 5-f,2-f,3-t,4-t