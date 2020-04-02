import config.Config;

public class StartCalculator {
    public static void main(String[] args) {
        Config config = new Config((args.length != 0) ? args[0] : Config.PATH_CONFIG);
        CalculatorImplementation impl = new CalculatorImplementation(config);
        impl.run();
    }
}
