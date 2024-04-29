module com.lestarieragemilang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lestarieragemilang to javafx.fxml;
    exports com.lestarieragemilang;
}
