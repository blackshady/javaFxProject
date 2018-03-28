/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.navigator;


import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import school.management.ui.main.MainController;

/**
 *
 * @author victorchibuike
 */
public class Navigator {
    
    public static final String MAIN    = "/school/management/ui/main/Main.fxml";
    public static final String GRID = "/school/management/ui/main/Grid.fxml";
    public static final String STAFF_REGISTRATION = "/school/management/ui/staff/STAFFREG.fxml";
    public static final String ADMIN_REGISTRATION = "/school/management/ui/admin/adminReg.fxml";
    public static final String STUDENT_REGISTRATION = "/school/management/ui/student/studentReg.fxml";
    public static final String ADMIN_INFO = "/school/management/ui/admin/admininfo.fxml";
    public static final String STUDENT_INFO = "/school/management/ui/student/studentinfo.fxml";  
    public static final String STAFF_INFO = "/school/management/ui/staff/staffinfo.fxml";
    public static final String STUDENT_RESULT = "/school/management/ui/student/studentResult.fxml";
    public static final String EDITH_RESULT = "/school/management/ui/student/edithResult.fxml";
    public static final String ADD_RESULT = "/school/management/ui/student/addResult.fxml";
    public static final String STUDENT_ASS = "/school/management/ui/student/studentAss.fxml";
    public static final String EDITH_ASS = "/school/management/ui/student/edithAss.fxml";
    public static final String ADD_ASS = "/school/management/ui/student/addAss.fxml";
    
    
     private static MainController mainController;
     
   
    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public static void setMainController(MainController mainlController) {
        Navigator.mainController = mainlController;
    }
     
     
      public static void loadPane(String fxml) {
        try {
            mainController.setPane(
                FXMLLoader.load(
                    Navigator.class.getResource(fxml )));
        } catch (IOException e) {
            e.printStackTrace();
            
            Logger.getLogger(Navigator.class.getName()).log(Level.SEVERE, null,e);
       
        }
    }
    
}
