package lesson9.hm.kupryunina.figures;

public class Circle extends Shape {

    public Circle(int length) {
        super(length);
    }

    @Override
    public double calculateArea() {
        System.out.println("\nРасчет площади круга");
        return 0;
    }
    public double calculateAreaOfCircle() {
        while (true) {
            System.out.println("Площадь круга равна - " + (((getLength() * getLength()) / (4 * 3.1415))));
            break;
        }
        return 0;
    }
}
