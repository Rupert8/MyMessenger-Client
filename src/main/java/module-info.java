module ua.rupert.messenger {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires spring.context;
    requires spring.beans;
    requires spring.core;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    requires static lombok;

    requires org.slf4j;

    exports ua.rupert.messenger;
    exports ua.rupert.messenger.config;

    opens ua.rupert.messenger.config to spring.core, spring.beans;
    opens ua.rupert.messenger.utils to spring.core, spring.beans;
    opens ua.rupert.messenger.controller to javafx.fxml, spring.core, spring.beans;




}