package homework5.robot.robot;

public class Application {
    public static void main(String[] args){
        CaffeeRobot caffeeRobot = new CaffeeRobot("Rd2");
        RobotDancer robotDancer = new RobotDancer(2);
        RobotCooker robotCooker = new RobotCooker(100);
        Robot robot = new Robot();



        String[] work4 = {caffeeRobot.getWork(), robotDancer.getWork(), robotCooker.getWork(), robot.getWork()};
        for (int i = 0; i < work4.length; i++){
            System.out.println(work4[i]);
        }


    }
}
