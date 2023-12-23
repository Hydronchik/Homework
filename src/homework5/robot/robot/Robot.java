package homework5.robot.robot;

public class Robot {
    private int year_of_release;
    private String work = "Я робот";

    public Robot() {
        this.year_of_release = year_of_release;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }



    @Override
    public String toString() {
        return "Robot{" +
                "year_of_release=" + year_of_release +
                '}';
    }
}
