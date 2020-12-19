package client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class History {
    private static PrintWriter printWriter;

    private static String getFileName(String login){
        return "history/history_" + login + ".txt";
    }

    public static void start(String login) throws FileNotFoundException {
            printWriter = new PrintWriter(new FileOutputStream(getFileName(login), true), true);
        }

    public static void writeLine(String msg){
        printWriter.println(msg);
    }

    public static String getLast100Lines(String login){
        if(!Files.exists(Paths.get(getFileName(login)))){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try{
            List<String> historyLines = Files.readAllLines(Paths.get(getFileName(login)));
            int startPosition = 0;
            if (historyLines.size()>100){
                for (int i = startPosition; i< historyLines.size(); i++){
                    stringBuilder.append(historyLines.get(i)).append(System.lineSeparator());
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }return stringBuilder.toString();
    }

    public static void stop(){
        if (printWriter != null){
            printWriter.close();
        }
    }


}
