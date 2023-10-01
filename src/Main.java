import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[2];

        Route route1 = new Route("Address 1","Address 2",150);
        Car car1 = new Car("123asd",route1,2);
        passengers[0] = new SubscribersPassengers("Sawsan", 23421,car1,100);

        try {
        passengers[0].reserveCar(car1);
        } catch (Exception a1){
            System.out.println(a1.getMessage());
        }
        passengers[0].displayInformation();


        System.out.println("______________________________________________________________");

        Route route2 = new Route("Address 1","Address 2",100);
        Car car2 = new Car("123asd",route2,0);
        passengers[1] = new NonSubscribersPassengers("Tamim", 56784,car2,122,true);
        try {
            passengers[1].reserveCar(car2);
        } catch (Exception a1){
        System.out.println(a1.getMessage());
        }
        passengers[1].displayInformation();


       /*
        SubscribersPassengers subscribersPassengers=new SubscribersPassengers("Sawsan",101100);
        Route route1 = new Route("Address 1","Address 2",150);
        Car car1 = new Car("123asd",route1,2);

        subscribersPassengers.reserveCar(car1);
        subscribersPassengers.displayInformation();

        System.out.println("______________________________________________________________________________");

        NonSubscribersPassengers nonSubscribersPassengers =new NonSubscribersPassengers("Tamim",10113400,true);
        Route route2 = new Route("Address 1","Address 2",100);
        nonSubscribersPassengers.reserveCar(car2);
        nonSubscribersPassengers.displayInformation();
    }
        */
    }
}