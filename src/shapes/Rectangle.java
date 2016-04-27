package shapes;

/**
 * Created by User on 27.04.2016.
 */
public class Rectangle extends Shape {

    double width;
    double heigh;

    Rectangle(double width,double heigh){
        this.heigh=heigh;
        this.width=width;
    }

    @Override
    public double square() {
        return heigh*width;
    }

    @Override
    public double perimeter() {
        return 2*(heigh+width);
    }
}
