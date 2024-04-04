
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 
 */
public class Conexao {
    
    public Connection conectaBD(){
        
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost/banco?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (Exception SQLe) {
            JOptionPane.showMessageDialog(null, 
                    "VIXE, DEU ERRO, o erro é esse: "
                            + SQLe.getMessage());
        }
        
        
        return conn;
    }
}
