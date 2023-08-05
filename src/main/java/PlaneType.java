public enum PlaneType {
    BOEING747(20, 100),
    AIRBUSA380(30, 150),
    CONCORDE(10, 50),
    DREAMLINER(40, 200);

    private final int capacity;

    private final double totalWeight;


    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}



