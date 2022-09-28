package Bouqet;

import Flower.Flower;

public class Bouqet {
    private final Flower[] flowers;

    public Bouqet(Flower[] flowers) {
        this.flowers = flowers;
    }


    public int getExpiryDays() {
        int count = flowers[0].getLifeSpan();
        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].getLifeSpan() < count) {
                count = flowers[i].getLifeSpan();
            }
        }
        return count;
    }

    public double getCosts() {
        double count = 0;

        for (int i = 0; i < flowers.length; i++) {
            count = count + flowers[i].getCost();
        }
        return count=count+(count/10);
    }

}
