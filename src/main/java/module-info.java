module com.lestarieragemilang {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.lestarieragemilang to javafx.fxml;
    exports com.lestarieragemilang;
}
