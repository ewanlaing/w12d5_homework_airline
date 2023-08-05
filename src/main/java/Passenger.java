public class Passenger {

    private String name;
    private numberOfBags numberOfBags;

    public Passenger (String name, numberOfBags numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags.getValue();
    }
}
