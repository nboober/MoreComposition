package composition;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Car mine = new Car(25, "black", "nissan", "Nick", 27, 3, 2001);
        System.out.println(mine.getName());
        System.out.println(mine.getAge());
        System.out.println(mine.getNumOfSpeedingTickets());
        System.out.println(mine.getYearofLicensure());
        System.out.println("\n");

        Car hers = new Car(50, "red", "Mercedes", "Jennifer", 27, 1, 2002);
        System.out.println(hers.getName());
        System.out.println(hers.getAge());
        System.out.println(hers.getNumOfSpeedingTickets());
        System.out.println(hers.getYearofLicensure());
        System.out.println("\n");

        System.out.println(mine.start());
        System.out.println(hers.start());
        System.out.println(mine.speed());
        System.out.println(hers.speed());
        System.out.println(mine.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(mine.speed());
        System.out.println(hers.speed());
        System.out.println(mine.decelerating());
        System.out.println(mine.speed());
        System.out.println(mine.stop());
        System.out.println("\n");

        System.out.println("Design your own Car. \nEnter your car information (Top Speed, Color, Brand, Name of driver, Age of driver, NumOfSpeedingTickets, YearofLicensure)");
        int speed = scanner.nextInt();
        String color = scanner.next();
        String brand = scanner.next();
        String name = scanner.next();
        int age = scanner.nextInt();
        int setNumOfSpeedingTickets = scanner.nextInt();
        int setYearofLicensure = scanner.nextInt();


        Car car3 = new Car();
        car3.setCar(speed, color, brand, name, age, setNumOfSpeedingTickets, setYearofLicensure);

        System.out.println(mine.getName());
        System.out.println(mine.getAge());
        System.out.println(mine.getNumOfSpeedingTickets());
        System.out.println(mine.getYearofLicensure());
    }
}
