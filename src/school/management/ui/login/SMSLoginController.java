
package school.management.ui.login;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import insidefx.undecorator.UndecoratorScene;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import school.management.ui.main.MainController;
import school.management.ui.navigator.Navigator;




public class SMSLoginController implements  Initializable {

    LoginModel loginMod = new LoginModel();
    
    
   
    @FXML
    private String Privilege;
    
    @FXML
    private ImageView bg1;
    
    @FXML
    private ImageView bg2;
     
    @FXML
    private JFXButton Staff_but;
    
    @FXML
    private JFXButton Admin_but;
     
    @FXML
    private AnchorPane drawer;
     
    @FXML
    private JFXButton close_but;
    
    @FXML
    private JFXButton mini_but;
    
    @FXML
    private AnchorPane AnchorPane;
     
    @FXML
    private Label query;
    
    @FXML
    private JFXButton Login_but;
    
    @FXML
    private JFXButton Staff_b;
    
    @FXML
    private JFXTextField UserId;
    
    @FXML
    private JFXPasswordField passW;
    
    Stage utilityStage;
      
 
    
    
    
    /*
    METHODS
    
    */  
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
       
        //Animate images
        sideShow();
      
        checkConnection();
       
    
        
    } 
    
   
   
    public void KeyPressed(KeyEvent e)
    {
    if(e.getCode() == KeyCode.ENTER){
    System.out.println("HELLO");
    }  
    }
    
    
    
    
    
    
    
    
    //Method that check is databaseis connected
    void checkConnection()
    {
    
        if(loginMod.isDataBaseConected())
        {
            System.out.print("Connected to Database");
        }else
        {
            System.out.print("Not Connected to Database"); 
        }
    }
    
    
    
    
    @FXML
    void staffClick(ActionEvent event) {
    drawerAction();
    this.Privilege = "Staff";
    }
    
     @FXML
    void returne(ActionEvent event) {
          this.query.setText("");
          drawerAction();
    }
    
     @FXML
    void adminClick(ActionEvent event) {
        drawerAction();
        this.Privilege = "Admin";
    }
    
    
    //Animate drawer
    @FXML
     public void drawerAction()  {   
          
       TranslateTransition openNav = new TranslateTransition(new Duration(350), drawer);
       openNav.setToX(0);
        TranslateTransition closeNav = new TranslateTransition(new Duration(350), drawer);
         
            if (drawer.getTranslateX() != 0) {
                openNav.play();
            } else {
                closeNav.setToX(-(drawer.getWidth()));
                closeNav.play();
            }
    }
     
     
   // slide show animation
   @FXML
   public void sideShow(){
       
        Line ln = new Line(263, 250, 789, 250);
       
       
       PathTransition transition = new PathTransition();
       transition.setNode(bg1);
       transition.setDuration(Duration.seconds(9));
       transition.setPath(ln);
        transition.setAutoReverse(true);
       transition.setCycleCount(PathTransition.INDEFINITE);
        transition.play();
        
        Line ln2 = new Line(263, 250, 789, 250);
       
       
       PathTransition transition2 = new PathTransition();
       transition2.setNode(bg2);
       transition2.setDuration(Duration.seconds(9));
       transition2.setAutoReverse(true);
       transition2.setPath(ln2);
       transition2.setCycleCount(PathTransition.INDEFINITE);
       transition2.play();   
   }
   
  
  
   
    @FXML
    public void Login(ActionEvent event) throws Exception
    {
        
        try
        {
            if(this.loginMod.isLogin(this.UserId.getText(), this.passW.getText(), this.Privilege))
            {
              Stage stage = (Stage)this.Login_but.getScene().getWindow();
              stage.close();
              
              switch(this.Privilege)
              {
                  case "Admin":
                  closeStage();
                  AdminLogin();
                    break;
                  case "Staff":
                     closeStage();
                     StaffLogin();
                    break;
                }
              
            }else
            {
                this.query.setText("WRONG INPUT");
            }
            
            
        }catch(Exception localException)
        {
            
        }
        
    }

    
    
    public void StaffLogin(){
      
    }
   
    
    
    
    public void AdminLogin() throws IOException
    {
    try {    
          this.utilityStage = new Stage();
         
       utilityStage.initModality(Modality.WINDOW_MODAL);
        
         utilityStage.setResizable(false);

            
        
        
        

        utilityStage.setScene(
            createScene(
                loadMainPane()
            )
        );

        utilityStage.show();
        
        
          
    
    
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    // minimize button
    @FXML
    void minimize(ActionEvent event) {
         Stage stage = (Stage) this.mini_but.getScene().getWindow();
        stage.setIconified(true);
    }             
  
    private void closeStage() {
        ((Stage) this.UserId.getScene().getWindow()).close();
    }
    
    // close button
    @FXML
    void close(ActionEvent event) {
     System.exit(0);
    }
    
        private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(
            getClass().getResourceAsStream(
                Navigator.MAIN
            )
        );

        MainController mainController = loader.getController();

        Navigator.setMainController(mainController);
        Navigator.loadPane(Navigator.GRID);
        
        return mainPane;
    }

    /**
     * Creates the main application scene.
     *
     * @param mainPane the main application layout.
     *
     * @return the created scene.
     */
    private Scene createScene(Pane mainPane) {
         UndecoratorScene scene = new UndecoratorScene(utilityStage, StageStyle.UTILITY, mainPane, null);
       
         scene.getStylesheets().setAll(
           getClass().getResource("/school/management/ui/main/main.css").toExternalForm()
        );

        return scene;
    }

 
    
    
    }
   



