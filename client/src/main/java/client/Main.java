package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//       Это все не сработало

//        Не понимаю в чем проблема, не может загрузить javaFx перепробовал уже все что мог(наверное).



//        loader.setLocation(new URL("sample.fxml"));
//        FXMLLoader loader = new FXMLLoader();
//        URL wayFxml = getClass().getResource("resources/sample.fxml");
//        loader.setLocation(wayFxml);
//        Parent root = loader.load();


//        String sceneFile = "main/resources/sample.fxml";
//        Parent root = null;
//        URL url = null;
//        try{
//            url = getClass().getResource(sceneFile);
//            root = FXMLLoader.load(url);
//        }catch(Exception ex){
//            System.out.println("Exception on FXMLLoader.load()");
//            System.out.println("*url: " + url);
//            System.out.println("*" + ex);
//            throw ex;
//        }
//            root = FXMLLoader.load(getClass().getResourceAsStream("sample.fxml"));

        Parent root;
        InputStream stream = (getClass().getResourceAsStream("sample.fxml"));
        root = new FXMLLoader().load(stream);

            primaryStage.setTitle("СпэйсЧат");
            primaryStage.setScene(new Scene(root, 450, 350));
            primaryStage.show();
            System.out.println("жопа слона");
        }


    public static void main(String[] args) {
        launch(args);
    }
}
