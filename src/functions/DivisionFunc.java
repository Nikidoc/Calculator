package functions;

public class DivisionFunc extends Function {
    public DivisionFunc() {
        super(2);
    }

    @Override
    public double calculate() {
        return getParam(0) / getParam(1);
    }

    @Override
    protected boolean correctParam(double valueParam, int indexParam) {
        return !((indexParam == 1) && (valueParam == 0.00));
    }
}
