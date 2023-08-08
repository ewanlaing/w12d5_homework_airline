import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;

    private ArrayList<Integer> seats;

    public Plane (PlaneType planeType){

        this.planeType = planeType;
        ArrayList<Integer> emptySeats = new ArrayList<>();
        for(int i = 1; i < planeType.getCapacity() + 1; i++){
            emptySeats.add(i);
        }
        this.seats = emptySeats;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }
}
