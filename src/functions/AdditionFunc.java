package functions;

public class AdditionFunc extends Function {
    public AdditionFunc() {
        super(2);
    }

    @Override
    public double calculate() {
        return getParam(0) + getParam(1);
    }
}
