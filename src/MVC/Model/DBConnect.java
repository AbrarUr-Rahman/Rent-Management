package house.rent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DBConnect extends login
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public static String i, n, m, cg;
    public DBConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/house_rental_system";  
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
            con = DriverManager.getConnection(url, info);
            st=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public boolean login(String u, String p) throws SQLException
    {
        try
        {
            String query = "select password from authentication where username='"+u+"';";
            rs= st.executeQuery(query);
            while(rs.next())
            {
                if(rs.getString("password").equals(p))
                {
                    return true;
                }
            }
            return false;
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
        return false;
    }
    public void cCreate(String n, String e, String c, String a, String u, String p) throws SQLException
    {
        try
        {
            String query = "insert into authentication values ('"+u+"', '"+p+"', 'customer');";
            st.executeUpdate(query);
            query = "insert into customerProfile values ('"+n+"', '"+e+"', '"+c+"' , '"+a+"', '"+u+"');";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public void oCreate(String n, String e, String c, String a, String u, String p) throws SQLException
    {
        try
        {
            String query = "insert into authentication values ('"+u+"', '"+p+"', 'owner');";
            st.executeUpdate(query);
            query = "insert into ownerProfile values ('"+n+"', '"+e+"', '"+c+"' , '"+a+"', '"+u+"');";
            st.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    public String userType(String u) throws SQLException
    {
        String query = "select type from authentication where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            return rs.getString("type");
        }
        return "";
    }
    public String getName(String u) throws SQLException
    {
        String str=null, user=null;
        if("customer".equals(userType(u)))
        {
            user="customer";
        }
        else
        {
            user="owner";
        }
        String query = "select name from "+user+"profile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str=rs.getString("name");
        }
        return str;
    }
    public String getContact(String u) throws SQLException
    {
        String str=null, user=null;
        if("customer".equals(userType(u)))
        {
            user="customer";
        }
        else
        {
            user="owner";
        }
        String query = "select contact from "+user+"profile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str=rs.getString("contact");
        }
        return str;
    }
    public String getAddress(String u) throws SQLException
    {
        String str=null, user=null;
        if("customer".equals(userType(u)))
        {
            user="customer";
        }
        else
        {
            user="owner";
        }
        String query = "select address from "+user+"profile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str=rs.getString("address");
        }
        return str;
    }
    public String getEmail(String u) throws SQLException
    {
        String str=null, user=null;
        if("customer".equals(userType(u)))
        {
            user="customer";
        }
        else
        {
            user="owner";
        }
        String query = "select email from "+user+"profile where username='"+u+"';";
        rs= st.executeQuery(query);
        while(rs.next())
        {
            str=rs.getString("email");
        }
        return str;
    }
    public void giveRent(String flatID, String desc, String price, String user)
    {
        try {
            int result = Integer.parseInt(price);
            String query = "insert into flat values ('"+flatID+"', '"+desc+"', "+result+", '"+user+"', '', 'Yes');";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void removeRent(String desc, String user)
    {
        try {
            String query = "update flat set available='No' where description='"+desc+"' and owner='"+user+"';";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void makePayment(String cC, String oC, String am, String tx, String id, String cU, String oU)
    {
        try {
            String query = "insert into payment values ('"+cC+"', '"+oC+"', "+am+", '"+tx+"', '"+id+"', '"+cU+"', '"+oU+"');";
            st.executeUpdate(query);
            query="update flat set customer='"+cU+"' where flatID='"+id+"' and owner='"+oU+"';";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int countShout(String u) throws SQLException
    {
        String query = "select count(*) from shout WHERE date >= DATE_SUB(CURDATE(), INTERVAL 7 DAY) order by date desc;"; 
        rs=st.executeQuery(query);
        String res="";
        while(rs.next())
        {
            res=rs.getString("count(*)");
        }
        return Integer.parseInt(res);
    }
    public void setShout(String u, String s) throws SQLException
    {
        String query = "insert into shout values ('"+u+"', '"+s+"', '"+java.time.LocalDateTime.now()+"');";
        st.executeUpdate(query);
    }
    
    public static void main(String [] args)
    {
        
    }
}


