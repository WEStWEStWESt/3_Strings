package characterArrays.models;

import characterArrays.support.One;
import interfaces.Task;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

     /*
     Дан массив названий переменных в camelCase.
     Преобразовать в snake_case.
     */

public class TaskOne implements Task {
    private int countUpp = 0;
    private String[] strArr = new One().strArr;
    private Pattern pattern = Pattern.compile("[a-z][A-Z]");
    private ArrayList<String> arrList = new ArrayList<String>();

    @Override
    public Object call() throws Exception {

        for (int i = 0; i < strArr.length; i++) {
            String string = strArr[i];
            Matcher matcher = pattern.matcher(string);

            if (matcher.find()) {
                countUpp = i;

                char[] charArray = string.toCharArray();
                arrList.add(countUpp, converter(charArray).toLowerCase());

                System.out.println();
            } else {
                arrList.add(i, string);
                System.out.println("(" + (i) + ")element: " + " String without UPPERCASE letters. ");
            }
        }
        System.out.println("arrList" + arrList);
        //System.out.println("Uppercase counter = " + countUpp);
        return countUpp;
    }

    private String converter(char[] coincidenceArr) {
        char[] upChars = new char[coincidenceArr.length];
        int countUpChar = 0;
        int countLowChar = 0;

        for (int i = 0; i < upChars.length; i++) {

            if (Character.isUpperCase(coincidenceArr[i])) {
                countUpChar = i;
                upChars[countUpChar - 1] = '_';
                System.out.print(" isUp: " + upChars[countUpChar - 1] + "  ");
            } else {
                countLowChar = i;
                upChars[countLowChar] = coincidenceArr[i];
                System.out.print(" * ");
            }
        }
        return String.valueOf(upChars);
    }
}