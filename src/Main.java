public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");

        Parkable car1 = new Car();
        ParkingLot parkingLot = new ParkingLot(2);
        car1.park(parkingLot);

       Parkable car2 = new Car();
        car2.park(parkingLot);

        Parkable jeep1 = new Jeep();
        jeep1.park((parkingLot));

        parkingLot.isFull();

        car1.unpark(parkingLot);
       //car2.unpark(parkingLot);
    }
}
