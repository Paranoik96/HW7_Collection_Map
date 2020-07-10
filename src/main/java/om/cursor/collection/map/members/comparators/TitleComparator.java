package om.cursor.collection.map.members.comparators;

import om.cursor.collection.map.members.Family;

import java.util.Comparator;


public class TitleComparator implements Comparator<Family> {
    @Override
    public int compare(Family familyOne, Family familyTwo) {
        return familyOne.getTitle().compareTo(familyTwo.getTitle());
    }
}
