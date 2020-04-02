package functions;

public class MultiplicationFunc extends Function {
    public MultiplicationFunc() {
        super(2);
    }

    @Override
    public double calculate() {
        return getParam(0) * getParam(1);
    }
}
