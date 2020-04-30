package by.epam.module01.loop;

/*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1L {

    public static int getSumOfSequence() {
        int returnValue;
        int inputNumber;
            outUserMessage("Введите целое положительное число >>");
            inputNumber = readUsersNumber();
            if (inputNumber == -1) {
                return 0;
            }
            returnValue = 0;
            for (int i = inputNumber; i > 0; i--) {
            	returnValue += i;
            }
        
        return returnValue;
    }
    
    private static int readUsersNumber() {
    	try {
    		BufferedReader reader;
			String inputLine;
			String regExpNumber;
			Pattern numberPattern;
			Matcher numberMatcher;
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			regExpNumber = "^[1-9][0-9]*$";
			numberPattern = Pattern.compile(regExpNumber);
			
			while (true) {
				inputLine = reader.readLine();
				numberMatcher = numberPattern.matcher(inputLine);
				if (!numberMatcher.find()) {
					outUserMessage("Неправильный формат вводимых данных.\nВведите повтороно >>");
					continue;
				}
				return Integer.parseInt(inputLine);
			}
			
		} catch (IOException e) {
			outUserMessage("Ошибка считывания данных входящего потока");
			return -1;
		}
    }
    
    private static void outUserMessage(String message) {
		System.out.println(message);
	}
    
    public static void main(String[] args) {
		System.out.println(getSumOfSequence());
	}

}
