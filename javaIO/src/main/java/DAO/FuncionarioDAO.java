package DAO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    
    public void cadastrarFuncionario(FuncionarioDTO funDTO){
    String sql = "insert into tabela(nome, cidade) values (?,?)";
    
        Connection conn = new Conexao().conectaBD();
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, funDTO.getNomeFuncionario());
            pstm.setString(2, funDTO.getCidadeFuncionario());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
}
