public class SubscribersPassengers extends Passenger {
    /*public SubscribersPassengers(String name, int ID) {
        super(name, ID);
    }*/

    public SubscribersPassengers(String name, int ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    @Override
    public void reserveCar(Car car){
        setReservedCar(car);
        double tripCost = car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.5); // الراوتر هي اللي عندها سعر الرحله
        setTripCost(tripCost);
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}
