package homework12;

public class Horse extends Animal{
    private int speed;

    public Horse(String food, String locate, int speed) {
        super(food, locate);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void makeNoice() {
        System.out.println("ігого");
    }


    public void Eat() {
        System.out.println("травку");
    }


    public void Sleep() {

    }

    @Override
    public String toString() {
        return "Horse{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
