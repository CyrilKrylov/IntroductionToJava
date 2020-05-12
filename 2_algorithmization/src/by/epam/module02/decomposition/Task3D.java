package by.epam.module02.decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника*/

public class Task3D {

    public static void main(String[] args) {
        System.out.println(calculateHexagonArea(5));
    }

    public static double calculateHexagonArea(double hexagonSide){
        return 6 * calculateEquilateralTriangleArea(hexagonSide);
    }

    private static double calculateEquilateralTriangleArea(double triangleSide){
        return (calculateSquare(triangleSide) * Math.sqrt(3)) / 4;
    }

    private static double calculateSquare(double squareSide) {
        return squareSide * squareSide;
    }

}
