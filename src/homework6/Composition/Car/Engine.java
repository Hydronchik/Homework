package homework6.Composition.Car;

public class Engine {
    private String condition;
    public void engineOff(){
        condition = "Вимкнутий";
        System.out.println(condition);
    }
    public void engineOn(){
        condition = "Увімкнений";
        System.out.println(condition);
    }
}
