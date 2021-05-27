package characterArrays.models;

import characterArrays.support.One;
import interfaces.Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

     /*
     Дан массив названий переменных в camelCase.
     Преобразовать в snake_case.
     */

public class TaskOne implements Task {
    int count = 0;
    String str = new One().s;
    @Override
    public Object call() throws Exception {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            count++;
//                matcher.replaceAll("_%1");
        }

        System.out.println("Uppercase counter = " + count);
        return count;
    }
    /* String inputString = "This is simple that contains phone number +380505055050 That's great.";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            System.out.println("Phone number: " + matcher.group(0));
        }else {
            System.out.println("PHONE NUMBER NOT FOUND");
        }
        */










}
