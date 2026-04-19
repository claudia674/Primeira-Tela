module org.example.app_com_interface {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
<<<<<<< HEAD
=======
    requires atlantafx.base;
>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0

    opens org.example.app_com_interface to javafx.fxml;
    exports org.example.app_com_interface;
}