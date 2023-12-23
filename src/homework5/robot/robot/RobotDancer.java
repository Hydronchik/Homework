package homework5.robot.robot;

public class RobotDancer extends Robot{
    private int model_num;
    private String work = "Я танцюю";

    public RobotDancer(int model_num) {
        this.model_num = model_num;
    }

    public int getModel_num() {
        return model_num;
    }

    public void setModel_num(int model_num) {
        this.model_num = model_num;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "RobotDancer{" +
                "model_num=" + model_num +
                "} " + super.toString();
    }
}
