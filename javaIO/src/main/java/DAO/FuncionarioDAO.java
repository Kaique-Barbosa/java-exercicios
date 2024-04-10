package DAO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import VIEW.frmFuncionario;
import java.awt.List;
import java.sql.ResultSet;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    
    
    
    
    
    public void cadastrarFuncionario(FuncionarioDTO funDTO){
    String sql = "insert into tabela(nome, cidade) values (?,?)";
    String getSql = "SELECT * FROM banco.mostrardados";
        Connection conn = new Conexao().conectaBD();
        
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, funDTO.getNomeFuncionario());
            pstm.setString(2, funDTO.getCidadeFuncionario());
            
            ResultSet rs = pstm.executeQuery(getSql);
            
            while (rs.next()) {                
                
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            }
            
            
            
            
            pstm.close();
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            
         
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
}
