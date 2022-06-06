package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button btnOblicz;
    @FXML
    public TextField txtSrednica;
    @FXML
    public TextField txtWysokosc;
    @FXML
    public TextField txtCenaZaKg;
    @FXML
    public Label labelStalWaga;
    @FXML
    public Label labelStalKoszt;
    @FXML
    public Label labelNierdzWaga;
    @FXML
    public Label labelNierdzKoszt;

    @FXML
    public void onActionOblicz(ActionEvent actionEvent) {
        labelStalWaga.setText(Math.round(obliczWageWalcaStali(
                Double.parseDouble(txtSrednica.getText()), Double.parseDouble(txtWysokosc.getText()))) + " kg");
        labelStalKoszt.setText(Math.round((obliczWageWalcaStali(
                Double.parseDouble(txtSrednica.getText()), Double.parseDouble(txtWysokosc.getText())) * Double.parseDouble(txtCenaZaKg.getText()))) + " zl");
        labelNierdzWaga.setText(Math.round(obliczWageWalcaStaliNierdzewnej(
                Double.parseDouble(txtSrednica.getText()), Double.parseDouble(txtWysokosc.getText()))) + " kg");
        labelNierdzKoszt.setText(Math.round(obliczWageWalcaStaliNierdzewnej(
                Double.parseDouble(txtSrednica.getText()), Double.parseDouble(txtWysokosc.getText())) * Double.parseDouble(txtCenaZaKg.getText())) + " zl");
    }

    public double obliczWageWalcaStali(double S, double H) {
        double V = 0;
        return Math.round(V = ((Math.PI * Math.pow(S, 2) * H) / 4000) * 7.87);
    }

    public double obliczWageWalcaStaliNierdzewnej(double S, double H) {
        double V = 0;
        return Math.round(V = ((Math.PI * Math.pow(S, 2) * H) / 4000) * 8.15);
    }
}