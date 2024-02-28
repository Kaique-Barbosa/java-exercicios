package entidades;

public class Funcionarios {
    public String nome;
    public float salarioBruto;
    public float imposto;
    private float salarioLiquido;
    
    public float calcularSalarioLiquido(){ 
        salarioLiquido = salarioBruto - imposto; 
        return salarioLiquido;
    }
    
    public void aumentarSalario(int percentil){
        float salario =  this.salarioLiquido * percentil / 100;
        this.salarioLiquido = this.salarioLiquido += salario;
    }
    
    public float getSalarioLiquido(){
        return salarioLiquido; 
    }
}


