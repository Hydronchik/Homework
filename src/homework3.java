public class homework3 {
    public static void main(String[] args) {
        //#1
        int[] a = {1, 54, 6, 13, 50, 13, 70, 14, 163, 73, 167};
        int x1 = 0;
        int sum = 0;
        double znach = 0;// - double я поставив на випадок якщо число буде не цілим
        for (int i = 0; a.length > i; i++) {
            x1 = i + 1; //- це колічество чісел
            sum = a[i] + sum; //- це сума получілась
            znach = sum / x1;//- це ділення, знак %-не працював бо він тільки вказує на true або false, і я случайно ввів / - тіпа дроб і запрацювало
        }
        System.out.println("Це кількість чисел " +x1);
        System.out.println("Це сума чисел " + sum);
        System.out.println("Це середнє значення чисел " + znach);
        System.out.println("=====-==-=-=-=-=-=-=-==-");
        //#2
        int[] b = {10, 1, 163, 51, 193, 6, 111};
        int max = 0;
        int min = 1;
        min = b[0];
        for(int i2 = 0; i2 < b.length; i2 ++){
            if(max <= b[i2]){
                max = b[i2];

            }
            if(min >= b[i2]){
                min = b[i2];

            }

        }
        System.out.println("Мінімільне число: "+min);
        System.out.println("Мінімільне число: "+max);
        System.out.println("========================");
        //#3
        int[] c = {51, 163, 61, 72, 16, 5, 1, 671};
        int num = 0;
        for(int i3 = 0; i3 < c.length; i3++){
            num = c[i3];
            if(num == 1){
                System.out.println("Ось ваше число: "+num);
            }
        }
        System.out.println("===================================");
        //# 4
        int[] d = {51, 62, 734, 12, 23, 84, 59};
        for(int i4 = 0; i4 < d.length; i4++){
            if(d[i4] % 2 == 1){
                d[i4] = 0;
                System.out.println(d[i4]);
            }else {
                System.out.println(d[i4]);
            }
        }
        //#5
        System.out.println("===================================");
        int[] e = {613, 72, 216, 743, 1651, 854, 1235, 754, 1426, 846, 13};
        for(int i5 = 0; i5 < d.length; i5++){
            if(e[i5] % 2 == 0){
                e[i5] = 0;
                System.out.println(e[i5]);
            }else {
                System.out.println(e[i5]);
            }
        }





    }

}
