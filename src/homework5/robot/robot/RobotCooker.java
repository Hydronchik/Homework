package homework5.robot.robot;

public class RobotCooker extends Robot{
    private int battery;
    private String work = "Я готую";

    public RobotCooker(int battery) {
        this.battery = battery;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
    public static void work2(){
        System.out.println("Я готую");
    }
    @Override
    public String toString() {
        return "RobotCooker{" +
                "battery=" + battery +
                "} " + super.toString();
    }
}
