package machine;

public enum State {
    ACTION(0), BUYING(1), FILLING(2), TAKING(3), REMAINING(4), EXIT(5);

    State(int stateCode) {
        this.stateCode = stateCode;
    }

    private int stateCode;

    public int getStateCode() {
        return stateCode;
    }
}
