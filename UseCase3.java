public class UseCase3 {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
 
        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);
 
        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}

interface Rentable {
    double TAX_RATE = 0.0; // default tax rate
    double calculateRent(int days);
}   

class Car implements Rentable {
    static final double TAX_RATE = 0.1; // 10% tax
    static int totalVehiclesRented = 0;
 
    public double calculateRent(int days) {
        totalVehiclesRented++;
        return days * 1500; // $1500 per day
    }
}

class Bike implements Rentable {
    static final double TAX_RATE = 0.05; // 5% tax
    static int totalVehiclesRented = 0;
 
    public double calculateRent(int days) {
        totalVehiclesRented++;
        return days * 500; // $500 per day
    }
}
