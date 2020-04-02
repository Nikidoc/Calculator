import config.Config;
import functions.Function;
import input.Input;
import messages.Messages;

import java.io.IOException;

public final class CalculatorImplementation {
    private Config config;

    public CalculatorImplementation(Config config) {
        this.config = config;
    }

    public void run(){
        Messages.welcome();
        Input input = new Input(System.in);

        while (true){
            Messages.enterFunction();
            String designation;
            try {
                designation = input.readString();
            } catch (IOException e) {
                Messages.canNotRead();
                continue;
            }

            String className = config.getDesiganationsFunctions().getProperty(designation);
            Function function;
            try {
                function = getFunctionClass(className);
            } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
                Messages.classNotFound(className);
                continue;
            }

            input.enterParams(function);
            String result;
            try {
                result = "Result: " + function.calculate();
            } catch (ArithmeticException e) {
                Messages.arithmetic();
                continue;
            }
            System.out.println(result);
            Messages.line();
        }
    }

    private Function getFunctionClass(String nameFunction) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            Class newClass = Class.forName(nameFunction);
        if (!Function.class.isAssignableFrom(newClass)) {
            throw new IllegalStateException("Class " + nameFunction + " is not a Function");
        }
            return (Function) newClass.newInstance();
    }

}
