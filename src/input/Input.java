package input;

import exceptions.InvalidParameterException;
import functions.Function;
import messages.Messages;

import java.io.*;

public class Input {
    private BufferedReader bufferedReader;

    public Input(InputStream inputStream) {
        Reader inputStreamReader = new InputStreamReader(inputStream);
        this.bufferedReader = new BufferedReader(inputStreamReader);
    }

    private String readLine() throws IOException {
        return bufferedReader.readLine();
    }

    public double readDouble() throws IOException, NumberFormatException {
        return Double.parseDouble(readLine());
    }

    public String readString() throws IOException{
        return readLine();
    }

    public void enterParams(Function function){
        int i = 0;
        while (i < function.getNumParams()){
            Messages.enterParam(i + 1);
            try {
                function.addParams(readDouble());
                i++;
            } catch (NumberFormatException e) {
                Messages.incorrectData();
            } catch (IOException e){
                Messages.canNotRead();
            } catch (InvalidParameterException e) {
                Messages.invalidValue(i + 1);
            }

        }
    }

}
