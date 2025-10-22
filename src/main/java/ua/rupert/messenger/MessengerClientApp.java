package ua.rupert.messenger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.rupert.messenger.config.AppConfig;
import ua.rupert.messenger.utils.ScreenManager;

import java.io.IOException;

public class MessengerClientApp extends Application {
    private ConfigurableApplicationContext springContext;

    @Override
    public void init() {
        springContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    public void start(Stage stage) throws IOException {
        ScreenManager screenManager = springContext.getBean(ScreenManager.class);
        screenManager.setPrimaryStage(stage);
        screenManager.switchScene("/ua/rupert/messenger/fxml/Login.fxml");
    }

    @Override
    public void stop() throws Exception {
        springContext.close();
    }
}
