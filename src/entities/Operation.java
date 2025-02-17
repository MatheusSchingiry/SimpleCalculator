package entities;

public class Operation {
    private double value1;
    private double value2;

    public Operation() {
    }

    public Operation(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double sum() {
        return value1 + value2;
    }

    public double sub() {
        return value1 - value2;
    }

    public double mlt() {
        return value1 * value2;
    }

    public double div() {
        return value1 / value2;
    }
}
