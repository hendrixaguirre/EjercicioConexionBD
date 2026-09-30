module ni.edu.uam.ejercicioconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ni.edu.uam.ejercicioconexionbd.model to javafx.base;
    opens ni.edu.uam.ejercicioconexionbd to javafx.fxml;
    exports ni.edu.uam.ejercicioconexionbd;
    opens ni.edu.uam.ejercicioconexionbd.controller to javafx.fxml;
}