package Human;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация отсутствует";
        } else {
            this.town = town;
        }
    }

    public Human(String name, int yearOfBirth, String town, String position) {
        if (name == null) {
            this.name = "Информация отсутствует";
        } else {
            this.name = name;
        }
            this.yearOfBirth = yearOfBirth;

            this.town = town;

        if (position==null){
            this.position = "Информация отсутствует";
        }else {
        this.position = position;}
    }
}
