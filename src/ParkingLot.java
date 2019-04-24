public class ParkingLot {

    private int capacity;
    private int noofparkedcars =0;

    public ParkingLot(int i) {
        this.capacity=i;
    }

    public boolean isFull() {
        if(capacity==noofparkedcars){
            System.out.println("parking is full");
            return true;
        }
        else
        {
            System.out.println("parking is not full");
            return false;
        }
    }

    public void add()
    {

            noofparkedcars++;
        }
        public void reduce()

        {
        noofparkedcars--;
            System.out.println("Parking lot availiability");
            System.out.println(noofparkedcars);

        }
    }

