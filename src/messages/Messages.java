package messages;

import config.Config;

public class Messages {
    public static void canNotRead(){
        System.out.println("Can't read data. Please, try again");
    }
    public static void enterFunction(){
        System.out.println("Enter operation or function:");
    }
    public static void classNotFound(String className){
        System.out.println("Class not found. Please initialize class " + className);
    }
    public static void arithmetic(){
        System.out.println("Arithmetical error.");
    }
    public static void incorrectData(){
        System.out.println("Incorrect data. Please, enter a number");
    }
    public static void invalidValue(int numParam){
        System.out.println("Invalid value for param #" + (numParam));
    }
    public static void enterParam(int numParam){
        System.out.println("Enter param #" + (numParam));
    }
    public static void welcome(){
        System.out.println(Config.WELCOME);
    }
    public static void line(){
        System.out.println("-----------------------------");
    }


}
