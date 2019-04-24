public class Jeep implements Parkable {


    @Override
    public void park(ParkingLot parkingLot) {
        parkingLot.add();
        System.out.println("jeep parking");
    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        parkingLot.reduce();
        System.out.println("jeep unparking");


    }
}
