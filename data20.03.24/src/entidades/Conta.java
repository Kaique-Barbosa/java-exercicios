/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aluno
 */
public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    
    // numero da conta ------------------
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    // FIM ----------numero da conta ------------------
    
    // nome titular------------------
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    // FIM --------------nome titular------------------
        
    public void saque(double saldo){
        this.saldo -= (saldo + 5);
    }

    public void depo1sito(double saldo){
        this.saldo += saldo; 
    }

    
}
