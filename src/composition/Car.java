package composition;

import java.util.ArrayList;

public class Car extends Vehicle {

    private String brand = "";
    private String color = "";
    ArrayList<Car> cars = new ArrayList<>();
    private Driver driver;

    public Car(){
        this.driver = new Driver();
        driver.setName("Nick");
        driver.setAge(27);
        driver.setNumOfSpeedingTickets(2);
        driver.setYearofLicensure(2001);
    }

    public Car(int speed, String color, String brand, String name, int age, int setNumOfSpeedingTickets, int setYearofLicensure){
        super(speed);
        this.brand = brand;
        this.color = color;
        this.driver = new Driver();
        driver.setName(name);
        driver.setAge(age);
        driver.setNumOfSpeedingTickets(setNumOfSpeedingTickets);
        driver.setYearofLicensure(setYearofLicensure);

        System.out.println("There is a " + this.color + " " + this.brand + ".");
    }

    public String getName(){
        return driver.getName();
    }

    public String getAge(){
        return driver.getAge();
    }

    public String getYearofLicensure(){
        return driver.getYearofLicensure();
    }

    public String getNumOfSpeedingTickets(){
        return driver.getNumOfSpeedingTickets();
    }

    public void setCar(int speed, String color, String brand, String name, int age, int setNumOfSpeedingTickets, int setYearofLicensure){
        Car car = new Car(speed, color, brand, name, age, setNumOfSpeedingTickets, setYearofLicensure);
        cars.add(car);
    }

    public String getCars(){
        String str = "";

        for(Car item : cars){
            str += item;
        }

        return str;
    }

    public String speed(){
        return "The "+ this.color + " " + this.brand + " is going " + this.speed + " mph.";
    }

    public String start(){
        return "The "+ this.color + " " + this.brand + " is Starting...";
    }

    public String stop(){
        return "The "+ this.color + " " + this.brand + "  is stopping...";
    }

    public String accelerating(){
        this.setSpeed(this.speed + 10);

        return "The "+ this.color + " " + this.brand + " is accelerating..." + "\n" +
                " it is now going " + (this.speed) + " mph.";
    }

    public String decelerating(){
        this.setSpeed(this.speed - 10);

        return "The "+ this.color + " " + this.brand + " is decelerating..." + "\n" +
                " it is now going " + (this.speed) + " mph.";
    }

}
