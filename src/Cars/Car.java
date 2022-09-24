package Cars;

public class Car {
    private String brand;
    private String model;
    private double engine;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engine, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engine == 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
