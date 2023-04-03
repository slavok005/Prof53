package lesson2.shape;

public class FigureTestr {
    public static void main(String[] args) {
        Figure  [] figures = new Figure[1000];
        figures[0] = new Circle(15);

        figures[0].area();
    }
}
