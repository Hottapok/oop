import Bouqet.Bouqet;
import Cars.Car;
import Flower.Flower;
import Human.Human;

public class Main {
    public static void main(String[] args) {
//        Human maksim = new Human(null, 0, "Минск", "Бренд менеджер");
//        Human anna = new Human("Анна", 1993, "Москва", "Методист образовательных программ");
//        Human artem = new Human("Артем", 1995, "Москва", "Директор по развитию бизнеса");
//        Human katya = new Human("Катя", 1994, "Калининград", "продакт-менеджер");
//        getInfo(maksim);
//        getInfo(katya);
//        getInfo(artem);
//        getInfo(anna);
//        //task 2
//        Car car1 = new Car("Lada", "Grande", 1.7, "Желтый", 2015, "Россия");
//        Car car2 = new Car("Audi", "A8", 3.0, "Черный", 2020, "Германия");
//        Car car3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany");
//        Car car4 = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea");
//        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");
//        getInfoAboutCars(car1);
//        getInfoAboutCars(car2);
//        getInfoAboutCars(car3);
//        getInfoAboutCars(car4);
//        getInfoAboutCars(car5);
        Flower flower = new Flower(35.59, "Роза обыкновенная", "Голландия", 0);
        Flower flower1 = new Flower(15, "Хризантема", null, 5);
        Flower flower2 = new Flower(69.9, "Пион", "Англия", 1);
        Flower flower3 = new Flower(19.5, "Гипсофила", "Турция", 10);
        getInfoAboutFlower(flower1);
        getInfoAboutFlower(flower3);
        getInfoAboutFlower(flower2);
        getInfoAboutFlower(flower);
        Flower[] flowers = {flower, flower1, flower3, flower2};
        Bouqet bouqet = new Bouqet(flowers);
        getInfo(bouqet);


;
    }

    public static void getInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". " + "Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году." + " Я работаю на должности " + human.getPosition() + ". Будем знакомы!");
    }

    public static void getInfoAboutCars(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " " + ",год выпуска " + car.getYear() + " ," + "цвет кузова " + car.getColor() + " ," + "место сборки " + car.getCountry() + " ," + "объем двигателя " + car.getEngine());
    }

    public static void getInfoAboutFlower(Flower flower) {
        String str = String.format(", стоимость штуки - %.2f.", flower.getCost());
        System.out.println(flower.getFlowerColor() + " из " + flower.getCountry() + str + " рублей, срок стояния - " + flower.getLifeSpan());
    }
    public static void getInfo(Bouqet bouqet){
        System.out.println("Стоимость букета "+bouqet.getCosts()+", срок хранения "+bouqet.getExpiryDays()+" дней");
    }

}