package com.l3xxd.conversormulti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AppController extends MenuController implements Initializable  {
    @FXML
    private Label lbl_TitleApp;
    @FXML
    private ChoiceBox<String> chbox_values_1;
    @FXML
    private ChoiceBox<String> chbox_values_2;
    @FXML
    private TextField valueField;
    @FXML
    private Label lblFinal;
    private String[] Divisas = {
            "USD (Estados Unidos)",
            "EURO (Europa)" ,
            "PESO (Mexico)",
            "Yen (Japon)"
    };
    private String[] Temperaturas = {
            "Celsius (°C)",
            "Fahrenheit (°F)" ,
            "Kelvin (°K)"
    };
    private String[] Medidas = {
            "Kilometros (km)",
            "Metros (m)",
            "Centimetros (cm)" ,
            "milimetros (mm)"
    };
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl_TitleApp.setText("Conversor de " + viewSelected);
        switch (MenuController.viewSelected){
            case "Divisas":
                chbox_values_1.getItems().addAll(Divisas);chbox_values_1.getSelectionModel().selectFirst();
                chbox_values_2.getItems().addAll(Divisas);chbox_values_2.getSelectionModel().selectLast();
                break;
            case "Temperaturas":
                chbox_values_1.getItems().addAll(Temperaturas);chbox_values_1.getSelectionModel().selectFirst();
                chbox_values_2.getItems().addAll(Temperaturas);chbox_values_2.getSelectionModel().selectLast();
            break;
            case "Medidas":
                chbox_values_1.getItems().addAll(Medidas);chbox_values_1.getSelectionModel().selectFirst();
                chbox_values_2.getItems().addAll(Medidas);chbox_values_2.getSelectionModel().selectLast();
            break;
        }
    }

    public void GoToMenu(ActionEvent event) throws IOException {
        Parent MenuViewParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view-menu.fxml")));
        Scene MenuScene = new Scene(MenuViewParent);

        Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Window.setScene(MenuScene);
        Window.show();
    }

    public void GoConversor(ActionEvent event) throws IOException{
         double value = Double.parseDouble(valueField.getText());
         int optionSelected_1 =chbox_values_1.getSelectionModel().getSelectedIndex();
         int optionSelected_2 =chbox_values_2.getSelectionModel().getSelectedIndex();

        Operations operations = new Operations();
        operations.setInput_value(value);
        operations.setChbox_values_1(optionSelected_1);
        operations.setChbox_values_2(optionSelected_2);

        double finalCalc = operations.convertir();
        lblFinal.setText(String.valueOf(finalCalc));
    }


}


