package Transport;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    private double engine;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String number;
    private int numberOfSeats;
    private String tire;

    public  class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "Не корректные данные";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            if (keylessAccess == null || keylessAccess.isEmpty()) {
                this.keylessAccess = "Не корректные данные";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }
    }

    public  class Insurance {
        private double insuranceValidityPeriod;
        private int costOfInsurance;
        private String numberOfInsurance;

        public Insurance(int insuranceValidityPeriod, int costOfInsurance, String numberOfInsurance) {
            if (insuranceValidityPeriod == 0) {
                System.out.println("Не верная информация");
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            if (costOfInsurance == 0) {
                System.out.println("Не верная информация");
            } else {
                this.costOfInsurance = costOfInsurance;
            }
            if (numberOfInsurance == null|| numberOfInsurance.isEmpty()) {
                System.out.println("Не верная информация");
            }else {
                this.numberOfInsurance = numberOfInsurance;
            }
        }
        public void insurancePeriod(){
            Calendar calendar = new GregorianCalendar();
            int year = calendar.get(Calendar.YEAR);
            if (insuranceValidityPeriod>year){
                System.out.println("Срок действия страховки закончен");
            }
        }
        public void numberOfInsurance(){
            if (this.numberOfInsurance.length()!=9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    public Car(String brand, String model, double engine, String color, int year, String country,
               String transmission, String bodyType, String number, int numberOfSeats, String tire) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Неверные данные";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Неверные данные";
        } else {
            this.bodyType = bodyType;
        }
        Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(number.toUpperCase());
        if (m.find()) {
            this.number = number;
        } else {
            this.number = " некорректный номер ";
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        if (month < 5 || month > 10) {
            this.tire = "Необходима зимние шины";
        } else {
            this.tire = "Необходимы летние шины";
        }
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

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
