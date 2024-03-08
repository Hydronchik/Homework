package HomeWork15;

import java.util.Scanner;

public class Deputy extends Human{
    private String lastName;
    private String name;
    private int age;
    private boolean bribe;
    private int sizeBride;

    public Deputy(double weight, double height, String lastName, String name, int age, boolean bribe) {
        super(weight, height);
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public int getSizeBride() {
        return sizeBride;
    }

    public void setSizeBride(int sizeBride) {
        this.sizeBride = sizeBride;
    }


    @Override
    public String toString() {
        return "Deputy{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", sizeBride=" + sizeBride +
                "} " + super.toString();
    }
}