package com.example;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button login;

    @FXML
    private TextField loginText;

    @FXML
    private PasswordField passText;

    @FXML
    private ImageView slika;


    @FXML
    private AnchorPane uporabnik;


    @FXML
    void LoginButtonPress(ActionEvent event) throws IOException {
        login login;
        login =  new login();
        try {
            login.login_check(loginText.getText(), passText.getText());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'login.fxml'.";
        assert loginText != null : "fx:id=\"loginText\" was not injected: check your FXML file 'login.fxml'.";
        assert passText != null : "fx:id=\"passText\" was not injected: check your FXML file 'login.fxml'.";
        assert slika != null : "fx:id=\"slika\" was not injected: check your FXML file 'login.fxml'.";

        assert uporabnik != null : "fx:id=\"uporabnik\" was not injected: check your FXML file 'login.fxml'.";


    }

}