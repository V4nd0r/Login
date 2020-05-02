package loginscreen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class ViewController implements Initializable {
    
   @FXML
    private PasswordField passField;

    @FXML
    private Button loginButton;

    @FXML
    private TextField userField;

    @FXML
    private Pane basePane;

    @FXML
    private Label title;

    @FXML
    private Label statusLabel;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String email = userField.getText();
        String pass = passField.getText();

        
        if (email.equals("example@example.com") && pass.equals("mambo"))
            statusLabel.setText("Acces granted!");
        else if (email.length() < 3 || !email.contains("@") || !email.contains("."))
            statusLabel.setText("Please enter a valid e-mail address!");
        else if (pass.equals(""))
            statusLabel.setText("Please enter your password!");
        else
            statusLabel.setText("Acces denied. Please try again!");
        
        System.out.println("Attempt to access.");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
