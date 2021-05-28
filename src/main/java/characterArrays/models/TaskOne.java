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
    String[] sA = new One().strArr;
    String varStr;
    Pattern pattern = Pattern.compile("[A-Z]");
    Matcher matcher;

    @Override
    public Object call() throws Exception {

        for (int i = 0; i < sA.length; i++){
            varStr = sA[i];
            matcher = pattern.matcher(varStr);

           while(matcher.find()) {
               count++;
            }

        }
        System.out.println("Uppercase counter = " + count);

        return count;
    }
}
