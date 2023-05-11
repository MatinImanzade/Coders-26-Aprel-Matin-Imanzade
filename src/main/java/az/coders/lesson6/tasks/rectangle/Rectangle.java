package az.coders.lesson6.tasks.rectangle;

public class Rectangle {
    double widht;
    double height;

    public Rectangle(double widht,double height){
        this.height = height;
        this.widht = widht;
        System.out.println( "Width " + widht + " - " + "Heigth " + height );
    }

    public Rectangle (double sideLength){
        this(3,4);
        this.widht = sideLength;
        this.height = sideLength;
        System.out.println( "Width " + widht + " - " + "Heigth " + height );
    }
}
