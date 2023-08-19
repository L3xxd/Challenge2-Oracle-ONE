package com.l3xxd.conversormulti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
public class MenuController  {
    // -----------------------------------------------------------------------------------------------------------------
    static String viewSelected = "";
    public void GoToDivisas(ActionEvent event) throws IOException {
        viewSelected = "Divisas";
        Parent DivisasViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view-app.fxml")));
        Scene DivisasScene = new Scene(DivisasViewParent);
        Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Window.setScene(DivisasScene);
        Window.show();
    }
    public void GoToTemperaturas(ActionEvent event) throws IOException {
        viewSelected = "Temperaturas";
        Parent TemperaturasViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view-app.fxml")));
        Scene TemperaturasScene = new Scene(TemperaturasViewParent);
        Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Window.setScene(TemperaturasScene);
        Window.show();
    }
    public void GoToMedidas(ActionEvent event) throws IOException {
        viewSelected = "Medidas";
        Parent MedidasViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view-app.fxml")));
        Scene MedidasScene = new Scene(MedidasViewParent);
        Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Window.setScene(MedidasScene);
        Window.show();
    }
    @FXML
    public void OpenGitHub(){
        try{
            Desktop.getDesktop().browse(new URI("https://github.com/L3xxd"));
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void OpenLinkedIn(){
        try{
            Desktop.getDesktop().browse(new URI("www.linkedin.com/in/alejandro-balderas-rios"));
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

}
