public class Car implements Parkable {

    String registrationNum;
    @Override
    public void park(ParkingLot parkingLot) {

        parkingLot.add();

    }

    public  void unpark(ParkingLot parkingLot){

        parkingLot.reduce();
    }
}
