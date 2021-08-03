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
import java.util.Arrays;

public class YourOrderPlease {
    public static void main(String[] args) {
        String words = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(words));
    }

    public static String order(String words) {
        String result = "";

        char[] charArr;

        ArrayList<String> stringRes = new ArrayList<>();

        String[] resArr = words.split(" ");
        for (String s : resArr) {
            System.out.println(s);
        }
        System.out.println();

        for (String str : resArr) {
            charArr = str.toCharArray();


            for (char ch : charArr) {
                if (ch == '1') {
                    stringRes.add(0,str);
                } else if (ch == '2') {
                    stringRes.add(1,str);
                } else if (ch == '3') {
                    stringRes.add(2,str);
                } else if (ch == '4') {
                    stringRes.add(3,str);
                } else if (ch == '5') {
                    stringRes.add(4,str);
                } else if (ch == '6') {
                    stringRes.add(5,str);
                } else if (ch == '7') {
                    stringRes.add(6,str);
                } else if (ch == '8') {
                    stringRes.add(7,str);
                } else if (ch == '9') {
                    stringRes.add(8,str);
                }
            }
        }


        result = stringRes.get(0) + stringRes.get(1);
        return result;
    }
}
