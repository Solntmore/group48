package lesson9.hm.kupryunina.figures;

public class MainShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(10, 15);
        Circle circle = new Circle(15);

        System.out.println("Расчет площади геометрических фигур");

        System.out.println("Создали разные фигуры и положили их в массив фигур");
        Shape[] shapes = {rectangle, triangle, circle};
        for (Shape shape : shapes) {
            System.out.println();
            shape.calculateArea();

            if (shape instanceof Rectangle) {
                System.out.println("Это прямоугольник");
                Rectangle rectangleFromArray = (Rectangle) shape;
                rectangleFromArray.calculateAreaOfRectangle();
            } else if (shape instanceof Triangle) {
                System.out.println("Это треугольник");
                Triangle triangleFromArray = (Triangle) shape;
                triangleFromArray.calculateAreaOfTriangle();
            } else if (shape instanceof Circle) {
                System.out.println("Это круг");
                Circle circleFromArray = (Circle) shape;
                circleFromArray.calculateAreaOfCircle();
            }
        }
    }
}
