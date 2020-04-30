package by.epam.module02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class asdf {
	
	public static void main(String[] args) throws IOException {

        BufferedReader reader;
        String inputLine;
        String regExpNumber;
        Pattern numberPattern;
        Matcher numberMatcher;

        reader = new BufferedReader(new InputStreamReader(System.in));
		/* inputLine = reader.readLine(); */
        regExpNumber = "^[1-9][0-9]*$";
        numberPattern = Pattern.compile(regExpNumber);
        Matcher matcher = Pattern.compile(regExpNumber).matcher("712345") ;
        System.out.println(matcher.find());

    }

}
