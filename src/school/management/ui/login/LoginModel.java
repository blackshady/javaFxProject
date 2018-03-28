
package school.management.ui.login;

import java.sql.Connection;
import school.management.DButill.dbConection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    Connection  connection;
    
    public LoginModel()
    {
        try{
        this.connection = dbConection.getConnection();
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        if (this.connection == null)
        {
                System.exit(1);
        }
   
    }
    
    public boolean isDataBaseConected()
    {
       return this.connection !=null;
    }
    
    public boolean isLogin(String UserID, String PassWord, String Priv )throws Exception
    {
        PreparedStatement pt = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM LOGIN where USER_ID = ? and PASSWORD = ? and PRIVILEDGE = ?";
        
        try {
        pt = this.connection.prepareStatement(sql);
        
        pt.setString(1,  UserID);
        pt.setString(2,  PassWord);
        pt.setString(3,  Priv);
                
        rs = pt.executeQuery();
        
        boolean boll;
        if(rs.next())
        {
        return true;
        }
        return false;
        
        }catch(SQLException ex)
        {
            return false;
        }
        
        finally
                {
                  pt.close();
                  rs.close();
                }
        
    }
    
    
}


