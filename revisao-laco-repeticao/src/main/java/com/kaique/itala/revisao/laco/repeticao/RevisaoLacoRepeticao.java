
package com.kaique.itala.revisao.laco.repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class RevisaoLacoRepeticao {

    public static void main(String[] args) {
        
        String valor;
        String senha;
        
        do {
            valor = JOptionPane.showInputDialog("Digite sua senha");
            senha = "password";
            JOptionPane.showInputDialog(null,  "Senha invalida");
        } while (!valor.equals(senha));
        
        JOptionPane.showMessageDialog(null, "Senha valida, acesso permitido");
        
    }
}
