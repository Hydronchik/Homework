package homework6.Final.Mathematics;

public class Math {
    public int num1;
    public int num2;

    public Math(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public final void add(){
        System.out.println( + num1 + num2); //- якщо у нас стоїть фінал ми неможемо його більше нікуди всунуть тільки в цьому класі
    }
    public final void minus(){
        System.out.println( + num1 + num2);
    }
    @Override
    public String toString() {
        return "Math{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
