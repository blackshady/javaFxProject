/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.staff;

import school.management.DButill.dbConection;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXScrollPane;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.scene.image.ImageView;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import school.management.ui.main.MainController;
import school.management.ui.navigator.Navigator;

/**
 * FXML Controller class
 *
 * @author victorchi
 */
public class STAFFREGController implements Initializable {
    
    
    @FXML
    private JFXDatePicker DATE_OF_REG;

    @FXML
    private JFXTextField SURNAME;

    @FXML
    private JFXTextField FIRST_NAME;

    @FXML
    private ImageView PASS_PORT;

    @FXML
    private JFXRadioButton MALE;

    @FXML
    private JFXRadioButton FEMALE;

    @FXML
    private JFXComboBox<States> STATES;

    @FXML
    private JFXRadioButton SINGLE;

    @FXML
    private JFXRadioButton  MARRIED;

    @FXML
    private JFXRadioButton  OTHERS;
    
    @FXML
    private JFXRadioButton  YES;
      
    @FXML
    private JFXRadioButton  NO;
      
    @FXML
    private JFXDatePicker DATE_OF_BIRTH;

    @FXML
    private JFXTextArea HOME_ADD;

    @FXML
    private JFXComboBox<Nationality> NATIONALITY;

    @FXML
    private JFXTextArea LGA;

    @FXML
    private JFXTextField PHONE_CONTACT;

    @FXML
    private JFXTextField USER_ID;

    @FXML JFXPasswordField PASS_WORD;

    @FXML
    private JFXComboBox<Classes> CLASSES;

    @FXML
    private JFXTextField EMAIL;

    @FXML
    private JFXComboBox<Religions> RELIGION;
    
    @FXML
    private FileChooser FChooser;
    
    @FXML
    private File file;
    
    @FXML
    private Desktop desk = Desktop.getDesktop();
    
    @FXML
    Stage PrimaryStage ;
    
    @FXML
    private Image image;
    
    @FXML
    private Image defultIMAGE;
    
    
    
    @FXML
    ToggleGroup GENDER = new ToggleGroup();
    
    @FXML
    ToggleGroup STATUS = new ToggleGroup();
    
    @FXML
    ToggleGroup DISABILITY =  new ToggleGroup();
    
    @FXML
    ScrollPane scroll = new ScrollPane();
    
    @FXML
    private AnchorPane REGPANE = new AnchorPane();
    
    @FXML
    private dbConection DB;
    
    @FXML
    private FileInputStream fil;
    
    @FXML
    private  String usrID;
    
    @FXML
    private JFXTextField  QUALIFICATION;
    
    @FXML
    private String PREVILAGE;
    
    @FXML
     private JFXComboBox<SUBjects> SUBJECTS;
    
    
     MainController MN = new MainController();
    
     
  
     /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        /*
            defultIMAGE = new Image("MAINIMAGE/ADDMG.png");  
                    PASS_PORT.setImage(defultIMAGE);
                   PASS_PORT.setFitWidth(200);
                    PASS_PORT.setFitHeight(180);
                    PASS_PORT.setPreserveRatio(true);

        */
        
//   System.out.println(getuserID()) ;
    //   USER_ID.setText( getuserID() );
        //DB connection
        this.DB= new dbConection();
        
        //gender
      // MALE = new JFXRadioButton("MALE");
      // FEMALE = new JFXRadioButton("FEMALE");
       
        
      
      //  set PREVILAGE to Staff
      PREVILAGE =  "Staff";
      
      
        MALE.setToggleGroup(GENDER);
        MALE.setUserData("MALE");
        
        FEMALE.setToggleGroup(GENDER);
        FEMALE.setUserData("FEMALE");
   
        
        //STATUS GROUP
        SINGLE.setToggleGroup(STATUS);
        SINGLE.setUserData("SINGLE");
        
        MARRIED.setToggleGroup(STATUS);
        MARRIED.setUserData("MARRIED");

        
        OTHERS.setToggleGroup(STATUS);
        OTHERS.setUserData("OTHERS");   
        
        //DISABLITY IF ANY
         YES.setToggleGroup(DISABILITY);
         YES.setUserData("YES"); 
         
         NO.setToggleGroup(DISABILITY);
         NO.setUserData("NO");
         
         
         
         
        //ENUMS
        this.STATES.setItems(FXCollections.observableArrayList(States.values()));
        this.NATIONALITY.setItems(FXCollections.observableArrayList(Nationality.values()));
       this.RELIGION.setItems(FXCollections.observableArrayList(Religions.values()));
       this.CLASSES.setItems(FXCollections.observableArrayList(Classes.values()));
       this.SUBJECTS.setItems(FXCollections.observableArrayList(SUBjects.values()));
       
       //UPLOAD  IMAGE
       FChooser = new FileChooser();
       FChooser.getExtensionFilters().addAll(
            //  new ExtensionFilter("Text Files" , "*txt"),
              new ExtensionFilter("Image Files" , "*.png", "*.jpg", "*.gif"),
              new ExtensionFilter("All Files" , "*.*") 
               );
       
       // SET UP SCROLL PANE ON STAFF REG
       scroll.setContent(REGPANE);
       scroll.setPrefSize(770, 550);
       scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
       scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED); 
       scroll.setFitToHeight(true);
    }    
    /*
     public String StaffID()
    {
       String userid;
        int num = 00;
       num =  num +1;
       userid = "GSA/ST/" +num;
       return  userid;
    }
    
    public String getuserID()
    {
    return this.usrID = StaffID();
    } 

*/    
    
    
    @FXML
    void LOADFILECHOOSER(ActionEvent event) throws Exception {
       // 
    file = FChooser.showOpenDialog(PrimaryStage);
    
    if(file != null)//CHECK  IF FILE SELECTED  IS EMPTY
    {
  
        
       //SET IMAGE TO IMAGEVIEW
    image = new Image(file.toURI().toString(), 200, 180, true,true);
      
    
   PASS_PORT.setImage(image);
   PASS_PORT.setFitWidth(200);
   PASS_PORT.setFitHeight(180);
   PASS_PORT.setPreserveRatio(true);

    
    }
    }
    
    //REGISTER NEW STAFF
    @FXML
    void AddStaff(ActionEvent event) throws FileNotFoundException {
        
        if(ValidateFilds())
        {
        // 21 FILEDS
       
         String SqlInsert = "INSERT INTO STAFF_DATA(USERID, PASWORD,  FIRSTNAME, SURNAME, DATEOFBIRTH, DATEOFREG, GENDER, RELIGION, EMAIL, PHONECONTACT, NATIONALITY, LGA, HOMEADDRESS, CLASSTAKEN, DISABILITY, PASSPORT, PREVILAGE, SUBJECT, QULAIFICATION, STATEOFORIGIN, MARITALSTATUS ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            Connection con =  dbConection.getConnection();
            PreparedStatement psrt  = con.prepareStatement(SqlInsert);
            
           
            psrt.setString(1, USER_ID.getText());
            
            //,, 
            psrt.setString(2, PASS_WORD.getText());
            psrt.setString(3, FIRST_NAME.getText());
            psrt.setString(4, SURNAME.getText());
            psrt.setString(5, DATE_OF_BIRTH.getEditor().getText());
            psrt.setString(6, DATE_OF_REG.getEditor().getText());
            psrt.setString(7, GENDER.getSelectedToggle().getUserData().toString());
            psrt.setString(8, ((Religions)this.RELIGION.getValue()).toString()); 
            psrt.setString(9, EMAIL.getText()); 
            psrt.setString(10, PHONE_CONTACT.getText()); 
            psrt.setString(11, ((Nationality)this.NATIONALITY.getValue()).toString()); 
            psrt.setString(12, LGA.getText()); 
            psrt.setString(13, HOME_ADD.getText());
            psrt.setString(14, ((Classes)this.CLASSES.getValue()).toString()); 
            psrt.setString(15, DISABILITY.getSelectedToggle().getUserData().toString()); 
            
             //get image
            fil = new FileInputStream(file);
            
            //psrt.setBinaryStream(16, (InputStream)this.fil,  (int)file.length());
            psrt.setBinaryStream(16, (InputStream)fil, (int)file.length());
            psrt.setString(17, this.PREVILAGE);
            psrt.setString(18, "NO");
           // System.out.println(((SUBjects)this.SUBJECTS.getValue()).toString());
            psrt.setString(19, QUALIFICATION.getText());
            psrt.setString(20, ((States)this.STATES.getValue()).toString());
            psrt.setString(21, STATUS.getSelectedToggle().getUserData().toString()); 
            
            
            
            Alert COMF = new Alert(Alert.AlertType.CONFIRMATION);
            COMF.setTitle("ALERT");
            COMF.setHeaderText(null);
            COMF.setContentText("NEW STAFF WILL BE ADDED INTO THE DATABASE, DO YOU WANT TO CONTINUE");
            COMF.showAndWait();
      if(COMF.getResult().getText().equals("OK"))
       {
       
            
          
           
            
        psrt.execute();
        con.close();
       
        
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("ALERT");
            alert.setHeaderText(null);
            alert.setContentText("Staff Information Successfully Saved");
            alert.showAndWait();
             ClearFileds();
           }
          
      
        }catch(SQLException  E){
         E.printStackTrace();

        Logger.getLogger(STAFFREGController.class.getName()).log(Level.SEVERE, null,E);
        }
         
         }
        
    }
    
    @FXML
    public boolean ValidateFilds()
    {
    if ( FIRST_NAME.getText().isEmpty() | SURNAME.getText().isEmpty() |  PASS_WORD.getText().isEmpty() | 
         DATE_OF_BIRTH.getEditor().getText().isEmpty() | DATE_OF_REG.getEditor().getText().isEmpty() |
         QUALIFICATION.getText().isEmpty() |USER_ID.getText().isEmpty() | GENDER.getSelectedToggle() == null |
         STATUS.getSelectedToggle() == null | DISABILITY. getSelectedToggle() == null | PHONE_CONTACT.getText().isEmpty() |
         STATES.getValue() == null  | RELIGION.getValue()== null | NATIONALITY.getValue()== null 
            )
    {
    
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Alert");
            alert.setHeaderText(null);
            alert.setContentText("Necessary fields must be filled ");
            alert.showAndWait();
            
            
            
            
            return false;
    }
            return true;
    }
    
    @FXML
    public void ClearFileds(){
    
        
       this.USER_ID.setText("");
       this.HOME_ADD.setText("");
       this.PASS_WORD.setText("");
       this.LGA.setText("");
       this.QUALIFICATION.setText("");
       this.SURNAME.setText("");
       this.FIRST_NAME.setText("");
       this.CLASSES.getSelectionModel().clearSelection();
       this.GENDER.getSelectedToggle().setSelected(false);
       this.STATUS.getSelectedToggle().setSelected(false);
       this.NATIONALITY.getSelectionModel().clearSelection();
       this.STATES.getSelectionModel().clearSelection();
       this.RELIGION.getSelectionModel().clearSelection();
       this.EMAIL.setText("");
       this.DISABILITY.getSelectedToggle().setSelected(false);
       this.SUBJECTS.getSelectionModel().clearSelection();
       this.PHONE_CONTACT.setText("");
       this.DATE_OF_BIRTH.getEditor().setText("");
       this.DATE_OF_REG.getEditor().setText("");
    }
            
      public void HOMEPane(ActionEvent event) throws IOException {
            Navigator.loadPane(Navigator.GRID);
}
    
    
    
}
