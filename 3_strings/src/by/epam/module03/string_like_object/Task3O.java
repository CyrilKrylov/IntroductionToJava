package by.epam.module03.string_like_object;

/*Проверить, является ли заданное слово палиндромом*/

public class Task3O {

    public static void main(String[] args) {
        System.out.println(isPalindrome("топот"));
        System.out.println(isPalindrome("топотун"));
    }

    public static boolean isPalindrome(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

}
