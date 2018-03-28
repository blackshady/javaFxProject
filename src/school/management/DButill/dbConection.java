
package school.management.DButill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConection {
    
    
    //store database name;
    private static final String SQCON = "jdbc:sqlite:GSMS.sqlite";
    
    
    //get connection to the database
    public static Connection getConnection()throws SQLException
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCON);
        }
        catch(ClassNotFoundException ex)
        {
          ex.printStackTrace();
        }
        return null;
    }
    
}
