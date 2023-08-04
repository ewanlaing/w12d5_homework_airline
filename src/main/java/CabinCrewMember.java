public class CabinCrewMember extends Employee{
    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage() {
        return "Fasten your seatbelts!";
    }
}
