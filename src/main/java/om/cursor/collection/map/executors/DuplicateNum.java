package om.cursor.collection.map.executors;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateNum {
    public static void deleteDuplicateNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input numbers : ");
        String lineNum = scan.nextLine();
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
