
package atividade3;

import javax.swing.JOptionPane;


/**
 *
 * Uma empresa possui funcionários próprios e terceirizados.
    Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
    Funcionários terceirizados possuem ainda uma despesa adicional.
    O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas
    trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
    correspondente a 110% de sua despesa adicional.
    Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário)
    Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário.
    Construa o programa conforme projeto abaixo:
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     * 
     * nome, horas trabalhadas e valor por hora.
     */
    public static void main(String[] args) {
        // Registro de funcionários: 
     
        
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário"); 
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho"));
          
          int escolha = Integer.parseInt(JOptionPane.showInputDialog("1 - Funcionário tercerizzado \n 2 - Funcionário da empresa"));
          if(escolha == 1){
             double bonus = Double.parseDouble(JOptionPane.showInputDialog("Digite a soma das suas despezas"));
              // mostrar funcionário tercerizado
                FuncionarioTercerizado fct = new FuncionarioTercerizado(nome, horas, valor, bonus);
            JOptionPane.showMessageDialog(null, "Nome: "+fct.dadosFuncionario(0));
            JOptionPane.showMessageDialog(null, "Horas trabalhadas: "+fct.dadosFuncionario(1));
            JOptionPane.showMessageDialog(null, "Valor da Hora/trabalho: "+fct.dadosFuncionario(2));
            JOptionPane.showMessageDialog(null, "pagamento: " + fct.pagamento());
            JOptionPane.showMessageDialog(null, "Total com o bonus: " + fct.bonusSalario());
            
              
          }else {
          // mostrar funcionário
              Funcionario fc = new Funcionario(nome, horas, valor);
            JOptionPane.showMessageDialog(null, "Nome: "+fc.getNome());
            JOptionPane.showMessageDialog(null, "Horas trabalhadas: "+fc.getHorasTrabalhadas());
            JOptionPane.showMessageDialog(null, "Hora/trabalho: "+fc.getSalarioHora());
            JOptionPane.showMessageDialog(null, "pagamento: " + fc.pagamento());
            
          }
           
    }
    
}
