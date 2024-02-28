
package com.kaique.exercicio2.aula280224;

import entidades.Aluno;
import java.util.Scanner;

/**
 *
 * @author Kaque Barbosa
 */
public class App {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Aluno a1 = new Aluno();
            
            
            System.out.println("Digite a nota 1");
            a1.nota1 = entrada.nextFloat();
            System.out.println("Digite a nota 2");
            a1.nota2 = entrada.nextFloat();
            System.out.println("Digite a nota 3");
            a1.nota3 = entrada.nextFloat();
            
            a1.status();
    }
}
