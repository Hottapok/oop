package Flower;

public class Flower {
    private double cost;
    private String flowerColor;
    private String country;
    private int lifeSpan;

    public Flower(double cost, String flowerColor, String country, int lifeSpan) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
