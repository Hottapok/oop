package Human;

public class Human {
    private String name;
    private int birthdayDate;
    private String city;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(int birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getCity() {
        return city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Human(String name, int birthdayDate, String city, String position) {
        if (name == null) {
            this.name = "Информация отсутствует";
        } else {
            this.name = name;
        }
        if (birthdayDate <= 0) {
            this.birthdayDate = Math.abs(birthdayDate);
        } else {
            this.birthdayDate = birthdayDate;
        }
        if (city == null) {
            this.name = "Информация отсутствует";
        } else {
            this.city = city;
        }
        if (position==null){
            this.name = "Информация отсутствует";
        }else {
        this.position = position;}
    }
}
