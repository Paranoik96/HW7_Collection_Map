package om.cursor.collection.map.members;

public class Family implements Comparable<Family>{
    private final String name;
    private final int quantityMember;
    private final String title;
    private final String nameOfEmblem;

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;

    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", quantityMember=" + quantityMember +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                '}';
    }

    @Override
    public int compareTo(Family member) {
        return name.compareTo(member.getName());
    }
}
