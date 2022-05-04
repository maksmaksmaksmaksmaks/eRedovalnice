package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class UciteljController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tabela;

    @FXML
    void initialize() {
        assert tabela != null : "fx:id=\"tabela\" was not injected: check your FXML file 'ucitelj.fxml'.";

    }

}
