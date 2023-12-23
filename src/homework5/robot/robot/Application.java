package homework5.robot.robot;

public class Application {
    public static void main(String[] args){
        CaffeeRobot caffeeRobot = new CaffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();
        Robot robot = new Robot();



        Robot[] work4 = {caffeeRobot,robotCooker,robotDancer,robot};
        for (int i = 0; i < work4.length; i++){
            work4[i].work();
        }


    }
}
