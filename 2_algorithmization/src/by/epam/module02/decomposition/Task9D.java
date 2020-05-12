package by.epam.module02.decomposition;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой*/

public class Task9D {

    public static void main(String[] args) {
        System.out.println(calcQuadrilateralArea(5,5,5,5));
    }

    public static double calcQuadrilateralArea(double x, double y, double z, double t) {
        double areaOfRightTriangle;
        double areaOfSecondTriangle;

        areaOfRightTriangle = calcAreaOfRightTriangle(x, y);
        areaOfSecondTriangle = calcTriangleArea(z, t, calcHypotenuse(x, y));

        return areaOfRightTriangle + areaOfSecondTriangle;
    }

    private static double calcAreaOfRightTriangle(double firstCathetus, double secondCathetus){
        return (firstCathetus * secondCathetus) / 2;
    }

    private static double calcHypotenuse(double firstCathetus, double secondCathetus){
        double hypotenuse;

        hypotenuse = Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
        return hypotenuse;
    }

    private static double calcTriangleArea(double a, double b, double c){
        double semiperimeter;

        semiperimeter = calcSemiperimeter(a, b, c);
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    private static double calcSemiperimeter(double a, double b, double c) {
        return (a + b + c)/2;
    }

}