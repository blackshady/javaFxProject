/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import school.management.ui.navigator.Navigator;

/**
 * FXML Controller class
 *
 * @author VICTOR CHIBUIKE
 */
public class AdminRegController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 public void HOMEPane(ActionEvent event) throws IOException {
            Navigator.loadPane(Navigator.GRID);
}    
}
