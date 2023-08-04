public class Pilot extends Employee{

    private String licenceNum;
    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }


    public String getLicenceNum() {
        return licenceNum;
    }

    public String flyPlane() {
        return "Liftoff!";
    }
}
