public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }


    public double baggageWeightPerPassenger(){
        PlaneType planeType = flight.getPlane().getPlaneType();
        int capacity = planeType.getCapacity();
        double totalWeight = planeType.getTotalWeight();
        return (totalWeight/2)/capacity;
    }

    public double baggageWeightBooked(){
        double total = 0;
        double bagWeight = baggageWeightPerPassenger()/2;
        for(Passenger passenger: flight.getPassengers()){
            total += passenger.getNumberOfBags();
        }
        return total * bagWeight;
    }

    public double baggageWeightRemaining(){
        PlaneType planeType = flight.getPlane().getPlaneType();
        double baggageWeight = planeType.getTotalWeight()/2;
        return (baggageWeight - baggageWeightBooked());

    }
}
