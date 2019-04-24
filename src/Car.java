public class Car {

    String registrationNum;

    public void park(ParkingLot parkingLot) {

        parkingLot.add(this);

    }

    public  void unpark(ParkingLot parkingLot){

        parkingLot.reduce(this);
    }
}
