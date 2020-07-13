package com.cursor.collection.map.executors;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateNum {

    static class MyScanner {
        private static final Scanner scan = new Scanner(System.in);

        private MyScanner() {
        }

        public static Scanner getInstance() {
            return scan;
        }
    }
    public static void deleteDuplicateNum() {
        System.out.println("Please input numbers : ");
        String lineNum = MyScanner.getInstance().nextLine();
        String list = Arrays.stream(
                lineNum.replaceAll("^(,|\\s)*|(,|\\s)*$", "")
                        .replaceAll("(,\\s*)+", ",")
                        .split(","))
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println("After Deleting duplicates : ");
        System.out.println(list);
    }

}
