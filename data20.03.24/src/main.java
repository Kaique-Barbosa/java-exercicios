
import javax.swing.JOptionPane;
import entidades.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta ct = new Conta();
         int opcao = 0;
        JOptionPane.showMessageDialog(null, "Saldo Atual: \n " + ct.getSaldo());
        
        ct.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero da conta", "00.000-0")));
        ct.setTitular(JOptionPane.showInputDialog("Digite O nome do titular da conta"));
        
        JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÂO \n 1- para saque \n 2- para deposito");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação escolhida"));
        
        if(opcao == 1){
            ct.depo1sito(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia de deposito")));
        }else if(opcao ==2){
            ct.saque(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia de saque")));
        }
        
        JOptionPane.showMessageDialog(null, "Saldo Atual: \n " + ct.getSaldo());
        
        
        
        
        
   }
    
}
