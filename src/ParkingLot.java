public class ParkingLot {

    private int capacity;
    private int noOfParkedCars =0;

    public ParkingLot(int i) {
        this.capacity=i;

    }

    public boolean isFull() {
        if(capacity==noOfParkedCars)
        {
            //System.out.println(capacity);
            //System.out.println("parking is full");
            return true;
        }
        else
        {
            //System.out.println("parking is not full");
            return false;
        }
    }

    public void add()
    {
            noOfParkedCars++;
            System.out.println("No of Vehicles parked");
            System.out.println(noOfParkedCars);
            //System.out.println(capacity-noOfParkedCars);
    }

    public void reduce()

        {

            noOfParkedCars--;
            //System.out.println(noOfParkedCars);
            System.out.println("No of slots Remaining for parking");
            System.out.println(capacity-noOfParkedCars);
        }

}

