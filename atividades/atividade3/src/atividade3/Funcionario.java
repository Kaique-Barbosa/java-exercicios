
package atividade3;

/**
 *
 * @author kaique
 */
public class Funcionario {
    private String nome;

    
    private int horasTrabalhadas;
    private double salarioHora;
   
    public Funcionario(String nome, int horasT, double salario){
        this.nome = nome;
        this.horasTrabalhadas = horasT;
        this.salarioHora = salario;
        
    }
    
    public double pagamento(){
        double total = salarioHora * horasTrabalhadas;
        return total;
        
    }

            public String getNome() {
                return nome;
            }
            public int getHorasTrabalhadas() {
                return horasTrabalhadas;
            }
            public double getSalarioHora() {
                return salarioHora;
            }


}
