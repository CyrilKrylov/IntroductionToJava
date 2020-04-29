package by.epam.module01.linear_program;

public class Task5 {

    public static String getFormatedTime(int sec) {
        int hours = sec / 3600;
        return String.format("%02dч %02dмин %02dс", hours, (sec - hours * 3600) / 60, sec % 60);
    }

}
