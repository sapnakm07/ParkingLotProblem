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

    public void add(Car car)
    {

            noofparkedcars++;
        }
        public void reduce(Car car)

        {
        noofparkedcars--;
            System.out.println("Unparking");
            System.out.println(noofparkedcars);

        }
    }

