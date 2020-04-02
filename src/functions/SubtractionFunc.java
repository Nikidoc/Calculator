package functions;

public class SubtractionFunc extends Function {
    public SubtractionFunc() {
        super(2);
    }

    @Override
    public double calculate() {
        return getParam(0) - getParam(1);
    }
}
