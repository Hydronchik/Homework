public class homework {
    public static void main(String[] args) {


        for (int num = 44; num <= 120; num ++){ //- це чісла от 44 до 120  №1
            System.out.println("Чісла: " + num);
        }

        //-завдання №2
        int tem = 3;

        if (tem >= 20){
            System.out.println("Одівай Футболку бо температура: " + tem + "Гродусів");
        } else if (tem >= 10) {
            System.out.println("Одівай светр бо температура: " + tem + "Гродусів");
        } else if (tem >= 0) {
            System.out.println("Одівай куртку бо температура: " + tem + "Гродусів");
        }

        //- це дні тиждня №3
        int day = 5;

        switch (day){
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятниця");
                break;
        }

        boolean a = false;  //-спам машина  №4
        while (a) {
            System.out.println("A");
        }


    }
}
