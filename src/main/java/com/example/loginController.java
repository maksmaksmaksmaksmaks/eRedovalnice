package com.example;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.funkcije.login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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
    private ImageView slika;

    private ObservableList<String> a = FXCollections.observableArrayList("Učitelji","Starši","Admini");
    
   // @FXML
    //private ComboBox<String> uporabnik; /////////////////////////////////////////////////combobox not working

    @FXML
    void ForgetButtonPress(ActionEvent event) {

    }

    @FXML
    void LoginButtonPress(ActionEvent event) {
        login login;
        login =  new login();
        try {
            login.login_check(loginText.getText(), passText.getText());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        

    @FXML
    void initialize() {
        assert forgot != null : "fx:id=\"forgot\" was not injected: check your FXML file 'login.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'login.fxml'.";
        assert loginText != null : "fx:id=\"loginText\" was not injected: check your FXML file 'login.fxml'.";
        assert passText != null : "fx:id=\"passText\" was not injected: check your FXML file 'login.fxml'.";
        assert slika != null : "fx:id=\"slika\" was not injected: check your FXML file 'login.fxml'.";
       // assert uporabnik != null : "fx:id=\"uporabnik\" was not injected: check your FXML file 'login.fxml'.";
        //uporabnik.setItems(a);
    }

}