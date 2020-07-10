package om.cursor.collection.map.executors;

import om.cursor.collection.map.members.Family;
import om.cursor.collection.map.members.comparators.NameOfEmblemComparator;
import om.cursor.collection.map.members.comparators.TitleComparator;

import java.util.Map;
import java.util.TreeMap;

public class FamilyExecutor {
    public static void execute() {
        System.out.println("SORTED BY TITLE : ");
        sortElementByTitle();
        System.out.println("SORTED BY NAME OF EMBLEM : ");
        sortElementByNameOfEmblem();
        System.out.println("SORTED BY NAME : ");
        sortElementByName();

    }

    private static Map<Integer, Family>  initializeFamilyMap() {
        Map<Integer, Family> map = new TreeMap<>();
        map.put(1, new Family("Jonny", 2, "Killers", "Army of Heaven"));
        map.put(2, new Family("Kitty", 40, "NPC", "Just for Fun"));
        map.put(3, new Family("Jack", 6, "Healers", "Sky Wings"));
        map.put(4, new Family("Dean", 3, "Raiders", "Steal and Kill"));
        map.put(5, new Family("Dens", 12, "Paladin", "Brothers of Steel"));
        map.put(6, new Family("Curie", 54, "Robots", "Automatons"));
        map.put(7, new Family("Nagibator9000", 1, "God", "Rip and Tear"));
        map.put(8, new Family("Preston", 10, "Minuteman", "Settlement needs Help"));

        return map;
    }
    private static void sortElementByName() {
        Map<Integer, Family> familyMap;
        familyMap = initializeFamilyMap();
        familyMap.entrySet().stream()
               .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    private static void sortElementByTitle() {
        Map<Integer, Family> familyMap;
        familyMap = initializeFamilyMap();
        familyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(new TitleComparator()))
                .forEach(System.out::println);
    }


    private static void sortElementByNameOfEmblem() {
        Map<Integer, Family> familyMap;
        familyMap =initializeFamilyMap();
        familyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(new NameOfEmblemComparator().reversed()))
                .forEach(System.out::println);
    }
}

