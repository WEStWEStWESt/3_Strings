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
    private int count = 0;
    private int[] countIndex = new int[5];
    private String[] strArr = new One().strArr;
    private Pattern pattern = Pattern.compile("[a-z][A-Z]");
    private String string;
    private String[] varArr;
    private ArrayList<String> upperArrayList = new ArrayList<>();
    private char[] charArray = new char[50000];

    @Override
    public Object call() throws Exception {
//        for (String varStr : strArr) {
//            Matcher matcher = pattern1.matcher(varStr);
//
//            while (matcher.find()) {
//                if (!matcher.find()) {
//                    count++;
//                    System.out.println(" !find(varStr): " + varStr);
//
//                    string = varStr.toLowerCase();
//                    System.out.println("toLowerCase " + string);
//                   Matcher matcher1 = pattern2.matcher(string.toLowerCase());
//
//                } else {
//                    System.out.println(" group: " + matcher);
//                }
//            }
//        }

        for (int i = 0; i < strArr.length; i++) {
            string = strArr[i];
            Matcher matcher = pattern.matcher(string);
                if (matcher.find()) {
                    int index = i;
                    count++;

                    upperArrayList.add(string);
                    charArray = string.toCharArray();
                    for (int j = 0; j < charArray.length; j++) {
                        System.out.print(charArray[j] + "  ");
                    }
                    //System.out.println(index);
                    System.out.println();
                } else {
                    System.out.println( "(" + (i) + ")element: "  + " String without UPPERCASE letters. ");
                }

        }

//        if (count > 0){        }
        System.out.println();
        System.out.println("upperArrayList" + upperArrayList);
        System.out.println("Uppercase counter = " + count);
        return count;
    }



//    private void arrMethod (String str){
//        for (String s : strArr) {
//
//        }


            /*
                split(String regex) - делит строку на массив по какому-то правилу
                charAt(int index) - возвращает символ по указанному индексу
                toUpperCase(char ch) - переводит в верхний регистр
                substring(int beginIndex) - возвращает подстроку, начиная с указанного индекса
                */


//    }

}