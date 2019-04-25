public class Jeep implements Parkable {


    @Override
    public void park(ParkingLot parkingLot) {

        if(parkingLot.isFull())
        {
            System.out.println("No Parking Avaialable for Jeep");
        }
        else
        {
            parkingLot.add();
            //System.out.println("jeep parking");

        }
    }

    @Override
    public void unpark(ParkingLot parkingLot)
    {
        parkingLot.reduce();
        //System.out.println("jeep unparking");


    }
}
