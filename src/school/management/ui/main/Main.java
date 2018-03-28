/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.main;

import insidefx.undecorator.UndecoratorScene;
import insidefx.undecorator.Undecorator;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import school.management.ui.login.SMSLoginController;

/**
 *
 * @author victorchi
 */
public class Main extends Application {
    
  
    
      @Override
    public void start(Stage stage) throws Exception 
    {
       Parent root = FXMLLoader.load(getClass().getResource("/school/management/ui/login/SMSLogin.fxml"));
        
       Scene scene = new Scene(root);
       
      stage.setScene(scene);
       stage.initStyle(StageStyle.UNDECORATED);
     stage.show();
    }
    
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
    
}
