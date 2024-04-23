module co.edu.uniquindio.ejemplobridge.appejemplobridge {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens co.edu.uniquindio.ejemplobridge.appejemplobridge to javafx.fxml;
    exports co.edu.uniquindio.ejemplobridge.appejemplobridge;
}