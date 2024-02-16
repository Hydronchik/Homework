package homework12;

public class Cat extends Animal{
    private String color;

    public Cat(String food, String locate, String color) {
        super(food, locate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void makeNoice() {
        System.out.println("мяу");
    }


    public void Eat() {
        System.out.println("рибу");
    }


    public void Sleep() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
