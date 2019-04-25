public class Car implements Parkable {

    //String registrationNum;
    @Override
    public void park(ParkingLot parkingLot)
    {
        if(parkingLot.isFull()) {
            System.out.println("No parking Available for Car");
        }
        else
        {
            parkingLot.add();
            //System.out.println("Car parked");
        }

    }

    public  void unpark(ParkingLot parkingLot)
    {

        parkingLot.reduce();
        //System.out.println("Car unparked");
    }
}
