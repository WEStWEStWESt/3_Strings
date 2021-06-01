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
    private int[] countIndex = new int[5];
    private String[] strArr = new One().strArr;
    private Pattern pattern1 = Pattern.compile("[a-z][A-Z]");
    private String string;
    private StringBuffer sb;
    private String[] varArr;

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
            Matcher matcher = pattern1.matcher(string);
           // System.out.print(strArr[i]);
                //System.out.println(" !find(varStr): " + matcher);
                if (matcher.find()) {
                    count++;
                    countIndex[i] = i;
//                    string = varStr.toLowerCase();
//                    System.out.println("toLowerCase " + string);
//                   Matcher matcher1 = pattern2.matcher(string.toLowerCase());
                } else {
                    System.out.println(" group: " + matcher);
                }
            System.out.println();
        }
        System.out.println("Uppercase counter = " + count);

        for (int i = 0; i < countIndex.length; i++) {
            System.out.println(countIndex[i]);
        }

        return count;
    }

//    private void arrMethod (String str){
//
//        for (int i = 0; i < string.length(); i++) {
//            /*
//                split(String regex) - делит строку на массив по какому-то правилу
//                charAt(int index) - возвращает символ по указанному индексу
//                toUpperCase(char ch) - переводит в верхний регистр
//                substring(int beginIndex) - возвращает подстроку, начиная с указанного индекса
//                */
//        }
//
//    }

}