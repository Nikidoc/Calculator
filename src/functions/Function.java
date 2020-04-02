package functions;

import exceptions.InvalidParameterException;

import java.util.ArrayList;
import java.util.List;

public abstract class Function{
    private List<Double> params = new ArrayList<>();
    int numParams;

    public abstract double calculate();

    protected Function(int numParams){
        this.numParams = numParams;
    }

    double getParam(int index){
        return this.params.get(index);
    }

    public boolean addParams(double param) throws InvalidParameterException {
        if (this.correctParam(param, params.size())){
            return this.params.add(param);
        } else{
            throw new InvalidParameterException();
        }
    }

    public int getNumParams() {
        return numParams;
    }

    protected boolean correctParam(double valueParam, int indexParam){
        return true;
    }
}
