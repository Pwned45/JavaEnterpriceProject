package model;

public class Runway {
    private int num;
    private StateRunway state;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public StateRunway getState() {
        return state;
    }

    public void setState(StateRunway state) {
        this.state = state;
    }
}
