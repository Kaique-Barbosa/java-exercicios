
package atividade3;


/**
 *
 * @author kaique
 */
public class FuncionarioTercerizado extends Funcionario{
    private double bonusAdicional;

    public FuncionarioTercerizado(String nome, int horasT, double salario, double bonusAdicional){
        super(nome, horasT, salario);
        this.bonusAdicional = bonusAdicional;
    }
    
        public FuncionarioTercerizado(String nome, int horasT, double salario){
        super(nome, horasT, salario);
     
    }
    
    public double bonusSalario(){
        double total = super.pagamento() + (this.bonusAdicional * 1.1); // 1.1 corresponde a 110%
        return  total;
    }
    
    public String dadosFuncionario(int  posicao){
        String nome = super.getNome();
        int horas =  super.getHorasTrabalhadas(); 
        double salario = super.getSalarioHora();
       
        String dados[] = {nome, Integer.toString(horas),Double.toString(salario)};
        return dados[posicao];
        
    }
      
    
    
 
   
}
