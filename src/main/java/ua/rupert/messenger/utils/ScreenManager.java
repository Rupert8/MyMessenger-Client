package ua.rupert.messenger.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;

@Component
@RequiredArgsConstructor
@Slf4j
public class ScreenManager {
    private final ConfigurableApplicationContext springContext;
    private Stage primaryStage;


    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;

        try {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/ua/rupert/messenger/icons/MyMessenger-Photoroom.png")));
            primaryStage.getIcons().add(image);
        } catch (Exception e) {
            log.error("Error while loading icons from MyMessenger-Photoroom", e);
        }

        primaryStage.setTitle("MyMessenger");
    }

    public void switchScene(String fxmlPath) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Parent root = fxmlLoader.load();

        if (primaryStage.getScene() == null) {
            Scene scene = new Scene(root, 800, 650);
            primaryStage.setScene(scene);
        } else {
            primaryStage.getScene().setRoot(root);
        }

        primaryStage.show();
    }
}
