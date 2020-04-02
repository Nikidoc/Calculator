package functions;

public class SinFunc extends Function {
    public SinFunc() {
        super(1);
    }

    @Override
    public double calculate() throws ArithmeticException {
        return Math.sin(Math.toRadians(getParam(0)));
    }
}
