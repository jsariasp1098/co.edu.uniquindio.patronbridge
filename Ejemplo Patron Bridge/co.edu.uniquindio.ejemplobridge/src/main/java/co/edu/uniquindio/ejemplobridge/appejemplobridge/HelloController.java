package co.edu.uniquindio.ejemplobridge.appejemplobridge;

import co.edu.uniquindio.ejemplobridge.appejemplobridge.Factory.ModelFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Button btnPreparar;

    @FXML
    private ChoiceBox cbFactory;

    @FXML
    private ChoiceBox cbSabor;

    @FXML
    private TextArea txtMostrar;

    @FXML
    void initialize() {
        ObservableList<String> factory = FXCollections.observableArrayList("Pequeña","Mediana","Grande");
        cbFactory.setItems(factory);
        ObservableList<String> sabor = FXCollections.observableArrayList("Arequipe","Chocolate","Mora");
        cbSabor.setItems(sabor);
    }

    @FXML
    void onPreparar(ActionEvent event) {
        String factory = cbFactory.getSelectionModel().getSelectedItem().toString();
        String sabor = cbSabor.getSelectionModel().getSelectedItem().toString();

        craerFactory(factory,sabor);
        txtMostrar.setText(factory + sabor);
    }

    private void craerFactory(String factory, String sabor) {
         ModelFactory.crearFactory(factory,sabor);
    }
}