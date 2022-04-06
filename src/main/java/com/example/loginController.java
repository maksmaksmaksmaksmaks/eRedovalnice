package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.funkcije.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button forgot;

    @FXML
    private Button login;

    @FXML
    private TextField loginText;

    @FXML
    private PasswordField passText;

    @FXML
    void ForgetButtonPress(ActionEvent event) {
        
    }

    @FXML
    void LoginButtonPress(ActionEvent event) {
        login login;
        login =  new login();
        login.login_check(loginText.getText(), passText.getText());
        
    }

    @FXML
    void initialize() {
        assert forgot != null : "fx:id=\"forgot\" was not injected: check your FXML file 'login.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'login.fxml'.";
        assert loginText != null : "fx:id=\"loginText\" was not injected: check your FXML file 'login.fxml'.";
        assert passText != null : "fx:id=\"passText\" was not injected: check your FXML file 'login.fxml'.";

    }

}