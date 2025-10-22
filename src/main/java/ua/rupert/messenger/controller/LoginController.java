package ua.rupert.messenger.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ua.rupert.messenger.utils.ScreenManager;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class LoginController {
    @FXML
    private Button minimizeButton, fullButton, closeButton;
    @FXML
    private Button loginButton, loginGoogleButton;
    @FXML
    private RadioButton RememberMeRadioButton;
    @FXML
    private Label forgotPasswordLabel, RegisterLabel;
    @FXML
    private TextField usernameField, passwordField;

    private final ScreenManager screenManager;

    public void toRegisterScreen() throws IOException {
        screenManager.switchScene("/ua/rupert/messenger/fxml/Registration.fxml");
    }
}
