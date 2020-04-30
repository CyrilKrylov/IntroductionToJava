package by.epam.module01.linear_program;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class Task6 {

    public static boolean isInArea(int x, int y) {
        return (((!(y > 4) && !(y < -3)) && (!(x > 2) && !(x < -2))) ||
                ((!(y > 0) && !(y < -3)) && (!(x > 4) && !(x < -4)))) && (x != 0 && y != -1);

    }

}
