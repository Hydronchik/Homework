public class less3 {
    public static void main(String[] args) {
        int[] num =  new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        System.out.println(num[3]);

        for(int i = 1; i < 4; i++){
            System.out.println(num[i]);
        }

        String[] c = {"twix","baunti","snikers"};
        System.out.println(c[0]);


        int[] a = {145, 53, 51, 70, 30, 12, 62};
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 1){
                System.out.println(a[i]);
            }
        }
        System.out.println("============");

        int[] art = {1,2,3};
        int sum = 0;
        for(int i = 0; i < art.length; i++){
            sum = art[i] + sum;

        }

        System.out.println(sum);

    }
}
