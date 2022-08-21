package Task1;

public class Rectangle implements Figure{
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return this.a * this.b;
    }

    @Override
    public double getPerimeter() {
        return (this.a + this.b) * 2;
    }
}
