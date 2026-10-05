package assignment;

public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rented;
    public static String companyName="mogadisho car Rentals";
    public static int totalCars=0;

    public Car() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rented = false;
        totalCars++;
    }

    public Car(String plateNumber,String carModel,double dailyRate){
        this.plateNumber=plateNumber;
        this.carModel=carModel;

        if(dailyRate>=0.0){
            this.dailyRate=dailyRate;
        }
        else {
            this.dailyRate=0.0;
            System.out.println("daily rental cannot be negative");
            rented=false;
            totalCars++;
        }

    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public String getCarModel(){
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    public boolean isRented(){
        return rented;
    }
    public void setDailyRate(double dailyRate){
        if(dailyRate>=0){
            this.dailyRate=dailyRate;
        }
        else {
            System.out.println("daily rate can be negative");
        }
    }
    public void rent(){
        if (!rented){
            System.out.println("car is already rented");
        }
        else {
            System.out.println("car has been succesfully");
        }
    }
    public void returnCar(){
        if (rented) {
            rented = false;
            System.out.println("Car  has been returned and is now available");
        } else {
            System.out.println("Car  was not rented");
        }
    }

    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Model        : " + carModel);
        System.out.println("Daily Rate   : $" + dailyRate);
        System.out.println("Status       : " + (rented ? "Rented" : "Available"));
        System.out.println("-----------------------------");
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }

}
class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("mogdissho-0011", "zasuki", 50);

        Car.displayCompanyName();

        car1.displayInfo();
        car2.displayInfo();

        car2.rent();
        car2.rent();
        car2.returnCar();

        car2.setDailyRate(60);
        car2.setDailyRate(-5);

        car2.displayInfo();

        Car.displayTotalCars();
    }
}

