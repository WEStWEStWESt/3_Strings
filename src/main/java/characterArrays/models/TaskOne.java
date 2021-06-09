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
    private String[] strArr = new One().strArr;
    private Pattern pattern = Pattern.compile("[A-Z]");
    private ArrayList<String> arrList = new ArrayList<>();

    @Override
    public Object call() throws Exception {

        for (int i = 0; i < strArr.length; i++) {
            String string = strArr[i];
            Matcher matcher = pattern.matcher(string);

            if (matcher.find()) {
                char[] charArray = string.toCharArray();
                arrList.add(i, converter(charArray));
            } else {
                arrList.add(i, string);
                System.out.println("(" + i + ")element: " + " String without UPPERCASE letters. ");
            }
        }
        System.out.println("arrList" + arrList);
        return arrList;
    }

    private String converter(char[] coincidenceArr) {
        int countUpChars = 0;
        for (char uppercaseChars : coincidenceArr) {
            if (uppercaseChars >= 65 && uppercaseChars <= 90) {
                countUpChars++;
            }
        }
        char[] newCharsArr = new char[coincidenceArr.length + countUpChars];
        int charsCounter = 0;
        int varForOffset = 0;
        while (charsCounter < coincidenceArr.length) {
            if (coincidenceArr[charsCounter] >= 65 && coincidenceArr[charsCounter] <= 90 && charsCounter != 0) {
                newCharsArr[charsCounter + varForOffset] = '_';
                newCharsArr[charsCounter + (varForOffset + 1)] = Character.toLowerCase(coincidenceArr[charsCounter]);
                varForOffset++;
            } else {
                newCharsArr[charsCounter + varForOffset] = coincidenceArr[charsCounter];
            }
            charsCounter++;
        }
        return String.valueOf(newCharsArr);
    }
}
