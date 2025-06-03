import Model.*;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs tRectangulo = new TriangleRect(20, 10, 10, 20, 30);
        FigureAbs tEquilatero = new TriangleEqui(20, 20, 20);


        FigureAbs[] figures = { sq, cir, triangle, tRectangulo, tEquilatero};

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
