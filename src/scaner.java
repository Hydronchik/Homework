import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
        int[] a = {4, 1, 73, 1, 35};
        int num = a[0];
        int sum = 5;
        for (int i = 0; i < a.length; i ++){
            num = num + a[i];
            if (num == sum){
                System.out.println(sum);
            }else {
                System.out.println("Nichogo");
            }
        }
    }
}
