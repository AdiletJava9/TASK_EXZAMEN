package model;

public class Group {
    private long ID;
    private String name;
    private String description;
    private int year;

    public Group(long ID, String name, String description, int year) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Group{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
