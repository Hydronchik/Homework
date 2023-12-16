package homework4;

public class Rectangle {
    private int length;
    private int width;
    public  Rectangle(){

    }
    public Rectangle(int length, int width){
        this.width = width;
        this.length = length;
    }
    public int getLength(){return length;}
    public void setLength (int length) {this.length = length;}
    public int getWidth(){return width;}
    public void setWidth (int width) {this.width = width;}

    public void perimeter(){
        int perimeter = length * 2 + width * 2;
        System.out.println("Периметр прямокутника = " + perimeter);
    }

    public void area(){
        System.out.println("Площа прямокутника: "+ length * width);
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
