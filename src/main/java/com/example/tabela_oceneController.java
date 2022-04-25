package com.example;


import java.net.URL;
import java.util.ResourceBundle;

import com.example.funkcije.ocene;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class tabela_oceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ocene> table;

    @FXML
    private TableColumn<ocene, Integer> ocena;

    @FXML
    private Button buttonAdd;

    @FXML
    private TextField text_ocena;

    @FXML
    void buttonAdd(ActionEvent event) {

    }

    
    
    @FXML
    void initialize() {
        assert ocena != null : "fx:id=\"ocena\" was not injected: check your FXML file 'Untitled'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'Untitled'.";
        assert text_ocena != null : "fx:id=\"text_ocena\" was not injected: check your FXML file 'Untitled'.";

        ocena.setCellValueFactory(new PropertyValueFactory<ocene, Integer>("ocena"));
        table.setItems(ocene.getOcene());

    }
}



