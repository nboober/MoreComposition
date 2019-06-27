package composition;

public class Driver extends Person {

    private int yearofLicensure = 0;
    private int numOfSpeedingTickets = 0;

    public Driver(){

    }

    public Driver(String name, int age, int yearofLicensure, int numOfSpeedingTickets){
        super(name, age);
        this.yearofLicensure = yearofLicensure;
        this.numOfSpeedingTickets = numOfSpeedingTickets;

    }

    public void setYearofLicensure(int yearofLicensure) {
        this.yearofLicensure = yearofLicensure;
    }

    public String getYearofLicensure(){
        return this.name + " got their licence in " + this.yearofLicensure + ".";
    }

    public void setNumOfSpeedingTickets(int numOfSpeedingTickets){
        this.numOfSpeedingTickets = numOfSpeedingTickets;
    }

    public String getNumOfSpeedingTickets(){
        return this.name + " has " + this.numOfSpeedingTickets + " speeding tickets.";
    }

}
