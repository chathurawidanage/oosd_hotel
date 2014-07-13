package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chathura Widanage <chathurawidanage@gmail.com>
 */
public class Connect {

    private Connect() {
    }

    static Connect c = new Connect();

    public static Connect getInstance() {
        return c;
    }

    Connection a;
    private String url;
    private String driver;
    private String uname;
    private String pword;
    private String dbname;

    public Connection Conn() {
        a = null;
        url = "jdbc:mysql://localhost:3306/";
        driver = "com.mysql.jdbc.Driver";
        uname = "root";
        pword = "";
        dbname = "hotel";
        try {
            Class.forName(driver).newInstance();
            a = DriverManager.getConnection(url + dbname, uname, pword);
            System.out.println("Connected");

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database" + ex);
        }
        return a;
    }

    public ResultSet getQuery(String query) {
        ResultSet r = null;
        try {
            a = Conn();
            Statement s = Conn().createStatement();
            r = s.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "not found");
        }
        return r;
    }

    public boolean setQuery(String query) {
        try {
            a = Conn();
            //Statement s = a.createStatement();
            Statement s = Conn().createStatement();
            s.execute(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public int setQuery(String query, String column_name) {
        int i = 0;
        try {
            a = Conn();
            Statement statement = Conn().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = statement.getGeneratedKeys();
            while (res.next()) {
                System.out.println("Generated key: " + res.getInt(1));
                i = res.getInt(1);
            }
            return i;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            return i;
        }
    }

}
