package co.edu.uniquindio.ejemplobridge.appejemplobridge.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MediumBuñueloFactory extends BuñueloFactory{


    public MediumBuñueloFactory(BuñueloMachine bm) {
        super(bm);
    }

    @Override
    public void prepararBuñuelo() {
        ObservableList<String> factory = FXCollections.observableArrayList("Pequeña","Mediana","Grande");
    }
}
