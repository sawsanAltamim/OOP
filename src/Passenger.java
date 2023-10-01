public abstract class Passenger {
    private String name;
    private int ID;
    private Car reservedCar;
    private double tripCost; // مايستقبل ترب كوست

    // البولين للي مو مشتركين
    /*public Passenger (String name, int ID){
    }*/

    /*public Passenger(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }*/

    public Passenger(String name, int ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }
/*  public Passenger(String name, int id, Car car) {
        this.name = name;
        this.ID = ID;
        this.
    }*/

    public abstract void reserveCar(Car car) throws Exception;

    public abstract void displayInformation();

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
