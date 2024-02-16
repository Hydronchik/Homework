package homework12;

public abstract class Animal {
    private String food;
    private String locate;

    public Animal(String food, String locate) {
        this.food = food;
        this.locate = locate;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }
    public abstract void makeNoice();
    public abstract void Eat();
    public abstract void Sleep();
    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", locate='" + locate + '\'' +
                '}';
    }
}
