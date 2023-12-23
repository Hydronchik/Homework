package homework5.robot.robot;

public class CaffeeRobot extends Robot{
    private String series;
    private String work = "Я варю кофе";

    public CaffeeRobot(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getWork() {
        return work;
    }

    public String setWork() {
        this.work = work;
        return null;
    }

    @Override
    public String toString() {
        return "CaffeeRobot{" +
                "series='" + series + '\'' +
                "} " + super.toString();
    }
}
