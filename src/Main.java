import Cars.Car;
import Human.Human;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(null, 0, "Минск","Бренд менеджер");
        Human anna = new Human("Анна", 1993, "Москва","Методист образовательных программ");
        Human artem = new Human("Артем", 1995, "Москва","Директор по развитию бизнеса");
        Human katya = new Human("Катя", 1994, "Калининград","продакт-менеджер");
        getInfo(maksim);
        getInfo(katya);
        getInfo(artem);
        getInfo(anna);
        //task 2
        Car car1=new Car("Lada","Grande",1.7,"Желтый",2015,"Россия");
        Car car2=new Car("Audi","A8",3.0,"Черный",2020,"Германия");
        Car car3=new Car("BMW","Z8",3.0,"Black",2021,"Germany");
        Car car4=new Car("KIA","Sportage",2.4,"Red",2018,"South Korea");
        Car car5 =new Car("Hyundai","Avante",1.6,"Orange",2016, "South Korea");
        getInfoAboutCars(car1);
        getInfoAboutCars(car2);
        getInfoAboutCars(car3);
        getInfoAboutCars(car4);
        getInfoAboutCars(car5);

    }
    public static void getInfo(Human human){
        System.out.println("Привет! Меня зовут "+ human.getName()+". "+ "Я из города "+ human.getCity()+". Я родился в "+ human.getBirthdayDate()+" году."+" Я работаю на должности "+ human.getPosition()+". Будем знакомы!");
    }
    public  static void getInfoAboutCars(Car car){
        System.out.println(car.getBrand()+" "+car.getModel()+" "+",год выпуска "+car.getYear()+" ,"+"цвет кузова "+car.getColor()+" ,"+"место сборки "+car.getCountry()+" ,"+"объем двигателя "+car.getEngine());
    }
}