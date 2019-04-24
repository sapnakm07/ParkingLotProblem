public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");

        Car car1 = new Car();
        ParkingLot parkingLot = new ParkingLot(2);
        car1.park(parkingLot);

        Car car2 = new Car();
        car2.park(parkingLot);

        parkingLot.isFull();

        car1.unpark(parkingLot);
//        car2.unpark(parkingLot);
    }
}
