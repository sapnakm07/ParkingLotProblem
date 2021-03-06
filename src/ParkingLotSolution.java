import java.util.*;

public class ParkingLotSolution {

    public static void main(String[] args)
    {
        System.out.println("Hello World");

        ParkingLot parkingLot = new ParkingLot(9);


        /*Parkable car1 = new Car();
        Parkable car2 = new Car();
        Parkable car3 = new Car();
        Parkable car4 = new Car();
        Parkable car5 = new Car();
        Parkable car6 = new Car();*/


        Vehicle car1 = new Car();
        Vehicle car2 = new Car();
        Vehicle car3 = new Car();
        Vehicle car4 = new Car();
        Vehicle car5 = new Car();
        Vehicle car6 = new Car();

        // Parking cars
        car1.park(parkingLot);
        car2.park(parkingLot);
        car3.park(parkingLot);
        car4.park(parkingLot);
        car5.park(parkingLot);
        car6.park(parkingLot);

        /*Parkable jeep1 = new Jeep();
        Parkable jeep2 = new Jeep();*/

        Vehicle jeep1 = new Jeep();
        Vehicle jeep2 = new Jeep();

        //Parking Jeep
        jeep1.park(parkingLot);
        jeep2.park(parkingLot);

        //Unparking Car
        car1.unpark(parkingLot);
        car2.unpark(parkingLot);

        //Unparking Jeep
        jeep1.unpark(parkingLot);



    }
}
