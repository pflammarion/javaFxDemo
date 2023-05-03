module org.isep.testhp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.isep.testhp to javafx.fxml;
    exports org.isep.testhp;
}