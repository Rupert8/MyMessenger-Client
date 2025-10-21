module ua.rupert.messengerappclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires spring.context;

    opens ua.rupert.messengerappclient to javafx.fxml;
    exports ua.rupert.messengerappclient;
    exports ua.rupert.messengerappclient.controller;
    exports ua.rupert.messengerappclient.config;

    opens ua.rupert.messengerappclient.controller to javafx.fxml;
}