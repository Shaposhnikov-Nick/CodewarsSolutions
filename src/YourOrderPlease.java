/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position
the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive
numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YourOrderPlease {
    public static void main(String[] args) {
        String words = "Empt1y string6 retur4n em5pty 3should i2nput";
        System.out.println(order(words));
    }


    public static String order(String words) {
        // если строка пустая, возвращаем пустую строку
        if (words.equals(""))
            return "";

        // раскладываем строку по словам в массив
        String[] resArr = words.split(" ");

        // создаем коллекцию для хранения результата. Заполняем
        ArrayList<String> stringRes = new ArrayList<>(resArr.length);
        for (int i = 0; i < resArr.length; i++) {
            stringRes.add("");
        }

        // прохоимся по каждому слову из массива
        for (int i = 0; i < resArr.length; i++) {

            // ищем цифру в каждом слове
            Pattern number = Pattern.compile("\\d"); // ([1-9])
            Matcher matcher = number.matcher(resArr[i]);

            while (matcher.find()) {
                // опредеяем цифру в слове
                String num = matcher.group();
                // переведим ее в int
                int index = Integer.parseInt(num);
                // добавляем слово из массива в коллекцию под найденным номером
                stringRes.set(index-1, resArr[i]);
            }
        }

        // собираем из коллекции строку
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < stringRes.size(); j++) {
            result.append(stringRes.get(j)).append(" ");
        }

        return result.toString().trim();

    }
}


