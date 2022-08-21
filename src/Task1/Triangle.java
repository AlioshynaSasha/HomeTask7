package Task1;

public class Triangle implements Figure {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        double semiPerimeter = this.getPerimeter() / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - this.a) * (semiPerimeter - this.b) * (semiPerimeter - this.c));
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
