package com.example;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.funkcije.login;

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

<<<<<<< HEAD
    private ObservableList<String> a = FXCollections.observableArrayList("Učitelji","Starši","Admini");
    
   // @FXML
    //private ComboBox<String> uporabnik; /////////////////////////////////////////////////combobox not working

    @FXML
    void ForgetButtonPress(ActionEvent event) {

    }
=======
    @FXML
    private AnchorPane uporabnik;
>>>>>>> ca5c0663b7f963e82d17aa788ff678e3ee6c34d2

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
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'login.fxml'.";
        assert loginText != null : "fx:id=\"loginText\" was not injected: check your FXML file 'login.fxml'.";
        assert passText != null : "fx:id=\"passText\" was not injected: check your FXML file 'login.fxml'.";
        assert slika != null : "fx:id=\"slika\" was not injected: check your FXML file 'login.fxml'.";
<<<<<<< HEAD
       // assert uporabnik != null : "fx:id=\"uporabnik\" was not injected: check your FXML file 'login.fxml'.";
        //uporabnik.setItems(a);
=======
        assert uporabnik != null : "fx:id=\"uporabnik\" was not injected: check your FXML file 'login.fxml'.";

>>>>>>> ca5c0663b7f963e82d17aa788ff678e3ee6c34d2
    }

}