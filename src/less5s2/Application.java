package less5s2;

public class Application {
    public static void main(String[] args){
        Human human = new Human("Danik", 52,
                new Sorts(6),
                new Tshirt("red"));
        System.out.println(human);
    }
}
