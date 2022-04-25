package com.example.funkcije;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ocene {
    public SimpleIntegerProperty ocena;
    //construcstor
    public ocene(int ocena) {
        this.ocena = new SimpleIntegerProperty(ocena);
    }

    //getter and setter for all
    public int getOcena() {
        return ocena.get();
    }

    public void setOcena(int ocena) {
        this.ocena.set(ocena);
    }

    public SimpleIntegerProperty ocenaProperty() {
        return ocena;
    }

    

    public static ObservableList<ocene> getOcene() {
        ObservableList<ocene> ocene_ = FXCollections.observableArrayList();
        for (int i = 0; i < vse_ocene_lenght(); i++) {
            ocene_.add(new ocene(vse_ocene()[i]));
        }
        return ocene_;
    }

    private static int vse_ocene_lenght() {
        int[] ocene = {1,2,3,4,5};
        int vse_ocene_lenght = ocene.length;
        return vse_ocene_lenght;
    }
    private static int[] vse_ocene()
    {
        int[] ocene = {1,2,3,4,5};
        return ocene;
    }


}
