package com.l3xxd.conversormulti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application  {
    @Override
    public void start(Stage primary_stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primary_stage.getIcons().add(new Image("/icon-alura.png"));
        primary_stage.setResizable(false);
        primary_stage.setTitle("Conversor Multi-Usos");
        primary_stage.setScene(scene);
        primary_stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}