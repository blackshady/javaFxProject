/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.main;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import school.management.ui.navigator.Navigator;

/**
 * FXML Controller class
 *
 * @author victorchi
 */

public class MainController {

  @FXML
    private JFXButton mini_but;

  @FXML
  private StackPane PaneHolder;
  
  @FXML
  private GridPane Grid_pane;

  @FXML
  private JFXButton NEW_STAFF;

  
  
  
 @FXML 
  public void setPane(Node node) {
   PaneHolder.getChildren().setAll(node);
 
    }
  
   @FXML
  void AdminRegPane(ActionEvent event) throws IOException {
            Navigator.loadPane(Navigator.ADMIN_REGISTRATION);
} 
    
    @FXML
  void StudentRegPane(ActionEvent event) throws IOException {
            Navigator.loadPane(Navigator.STUDENT_REGISTRATION);
} 
     
    @FXML
    void StaffRegPane(ActionEvent event) throws IOException {
              Navigator.loadPane(Navigator.STAFF_REGISTRATION);
}
    
    @FXML
    void minimize(ActionEvent event) {
        
        Stage stage = (Stage) this.mini_but.getScene().getWindow();
        stage.setIconified(true);
    }    
    
  
    @FXML
    void close(ActionEvent event) {
    System.exit(0);
    }
}
