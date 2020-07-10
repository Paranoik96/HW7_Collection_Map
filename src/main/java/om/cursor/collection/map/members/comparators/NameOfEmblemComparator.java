package om.cursor.collection.map.members.comparators;

import om.cursor.collection.map.members.Family;

import java.util.Comparator;

public class NameOfEmblemComparator implements Comparator<Family> {
    @Override
    public int compare(Family familyOne, Family familyTwo) {
        return familyOne.getNameOfEmblem().length() - familyTwo.getNameOfEmblem().length();
    }
}
