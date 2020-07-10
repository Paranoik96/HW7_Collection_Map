package om.cursor.collection.map;

import om.cursor.collection.map.executors.DuplicateNum;
import om.cursor.collection.map.executors.FamilyExecutor;

public class Application {
    public static void main(String[] args) {
        DuplicateNum.deleteDuplicateNum();
        FamilyExecutor.execute();

    }

}
