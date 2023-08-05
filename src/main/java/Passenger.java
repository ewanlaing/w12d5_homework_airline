public class Passenger {

    private String name;
    private numberOfBags numberOfBags;

    private Flight flight;

    public Passenger (String name, numberOfBags numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags.getValue();
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
