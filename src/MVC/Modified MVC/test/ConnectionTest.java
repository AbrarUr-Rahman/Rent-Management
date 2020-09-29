/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ConnectionTest {
    Connection con;
   
    @Before
    public void setUp() {
    }
    
    @Test
    public void connectionTest() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/house_rental_system";  
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
            con = DriverManager.getConnection(url, info);
            assertEquals(true,true);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            assertEquals(true,false);
        }
 
    }
    @Test
    public void connectionTest2() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/house_rental_system";  
            Properties info = new Properties();
            info.put("user", "niloy");
            info.put("password", "");
            con = DriverManager.getConnection(url, info);
            assertEquals(true,true);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            assertEquals(true,false);
        }
 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
