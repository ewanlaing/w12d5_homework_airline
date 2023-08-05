public enum numberOfBags {
    ZERO(0),
    ONE(1),
    TWO(2);

    private final int value;

    numberOfBags(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
