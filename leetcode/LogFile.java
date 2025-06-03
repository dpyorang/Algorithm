/* https://leetcode.com/problems/reorder-data-in-log-files/description/ */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LogFile {
    public static void main(String[] args) {

    }
    public String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];

        ArrayList<String> letterLog = new ArrayList<>();
        ArrayList<String> digitLog = new ArrayList<>();

        for (String log : logs) {
            char c = log.split(" ")[1].charAt(0);

            if (Character.isDigit(c)) {
                digitLog.add(log);
            } else {
                letterLog.add(log);
            }
        }

        Collections.sort(letterLog, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = o1.split(" ", 2);
                String[] arr2 = o2.split(" ", 2);

                int compare = arr1[1].compareTo(arr2[1]);
                if (compare == 0) {
                    return arr1[0].compareTo(arr2[0]);
                } else {
                    return compare;
                }
            }
        });

        letterLog.addAll(digitLog);

        return letterLog.toArray(new String[letterLog.size()]);
    }
}
