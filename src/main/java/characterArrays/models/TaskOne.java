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
    private int count = 0;
    private String[] strArr = new One().strArr;
    private Pattern pattern = Pattern.compile(".{0}[a-z][A-Z]");

    @Override
    public Object call() throws Exception {

        for (String varStr : strArr) {
            Matcher matcher = pattern.matcher(varStr);

            while (matcher.find()) {

                if (!matcher.find()) {
                    count++;
                    System.out.println(" !find: " + varStr);
//                    matcher.group().replace(matcher.group(), "[_a-z]");
//                    System.out.println(" group: " + matcher);

                }else {
                    System.out.println(" group: " + matcher.group());
                }
            }
        }
        System.out.println("Uppercase counter = " + count);
        return count;
    }
}
