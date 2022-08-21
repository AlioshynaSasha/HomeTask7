package Task1;

public class Round implements Figure{
    int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.pow(this.radius, 2) * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
}
