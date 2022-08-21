package Task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(2, 3, 2),
                new Rectangle(3, 4),
                new Round(6),
                new Round(8),
                new Rectangle(5, 8),
        };
        double sumPerimeter = 0.0;

        for (int i = 0; i < figures.length; i++) {
            sumPerimeter = figures[i].getPerimeter();
        }

        System.out.println("Obshaya summa perimetra: " + sumPerimeter);
    }
}
