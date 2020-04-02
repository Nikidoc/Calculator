package config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Config {
    public static final String WELCOME = "Hello! It's my simple calculator.";
    public static final String PATH_CONFIG = "./bin/functions.txt";
//    public static final String FUNCTION_POSTFIX = "_func";
//    public static final String PATH_TO_FUNCTIONS = "functions.";

    private Properties designationsFunctions;

    public Properties getDesiganationsFunctions() {
        return designationsFunctions;
    }

    public Config(String path){
        getFunctionsFromFile(path);
    }

    private void getFunctionsFromFile(String path) {
        FileReader fileConfig = null;
        try {
            fileConfig = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("Config file(" + path + ") not found");
            System.exit(1);
        }
        Properties designation = new Properties();
        try {
             designation.load(fileConfig);
        } catch (IOException e) {
            System.out.println("Can't read. Check format config file");
            System.exit(1);
        }
        this.designationsFunctions = designation;
    }



}
