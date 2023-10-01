public class NonSubscribersPassengers extends Passenger {
    private boolean discountCoupon;

    /*public NonSubscribersPassengers(String name, int ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }*/

    public NonSubscribersPassengers(String name, int ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car is already full");
        }
            setReservedCar(car);
            double tripCost;
            //if (car.getMaxCapacity() != 0) {
            if (discountCoupon) {
                tripCost = car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.1);
            } else {
                tripCost = car.getRoute().getTripPrice();
            }
            setTripCost(tripCost);
        }
    //}
    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}