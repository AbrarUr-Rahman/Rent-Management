/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import Model.DBConnect;
import static org.mockito.Mockito.when;

/**
 *
 * @author USER
 */
public class DBConnectTest {
    DBConnect db;
   
    
    @Before
    public void setUp() throws Exception {
     db=Mockito.mock(DBConnect.class);
    }
    
    @Test
    public void testgetEmail()throws Exception{
        when(db.getEmail("dont@gmail.com")).thenReturn("abrar@gmail.com");
        assertEquals("abrar@gmail.com",db.getEmail("dont@gmail.com"));
        
    }
    @Test
    public void testgetAddress()throws Exception{
        when(db.getAddress("221 Baker Street")).thenReturn("45 downton abbey");
        assertEquals("45 downton abbey",db.getAddress("221 Baker Street"));
        
    }
      @Test
    public void testgetName()throws Exception{
        when(db.getName("Ishmam")).thenReturn("abrar");
        assertEquals("abrar",db.getName("Ishmam"));
        
    }
        @Test
    public void testlogin()throws Exception{
        when(db.login("abrar","12345")).thenReturn(true);
        assertEquals(true,db.login("abrar","12345"));
        
    }
         @Test
    public void testusertype()throws Exception{
        when(db.userType("abrar")).thenReturn("client");
        assertEquals("client",db.userType("abrar"));
         }
         @Test
    public void testContact()throws Exception{
        when(db.getContact("123456789")).thenReturn("2345678");
        assertEquals("2345678",db.getContact("123456789"));
         }
         @Test
    public void testcountShout()throws Exception{
        when(db.countShout("number")).thenReturn(45);
        assertEquals(45,db.countShout("number"));
         }
    
}
