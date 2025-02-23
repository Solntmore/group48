package lesson9.hm.gross.figures;

public abstract class Shape {
    // Если указать тип возвращаемых данных (нпр: double), то метод calculateArea() в классе фигуры будет без sout, но с
    // return. И далее в классе main метод calculateArea() выводим через sout.
    // Визуально в классе Main мне нравится просто выводить метод, но можно и по-другому.
    abstract void calculateArea();
}
