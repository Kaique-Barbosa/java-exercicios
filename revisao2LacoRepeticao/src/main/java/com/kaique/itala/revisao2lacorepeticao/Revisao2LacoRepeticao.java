
package com.kaique.itala.revisao2lacorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class Revisao2LacoRepeticao {

    public static void main(String[] args) {
        int resposta = 0;
        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        int repetir = 0;

        while(repetir == 0 || resposta < 1 || resposta > 4 ){
            
             resposta = Integer.parseInt(JOptionPane.showInputDialog("1 - alcool\n 2 - Gasolina\n 3 - Diesel\n 4 - FIM\n"));
             if(resposta == 1){
                 contAlcool++;
             }else if(resposta == 2){
                 contGasolina++;
             }else if(resposta == 3){
                 contDiesel++;
             }
             if(resposta < 1 || resposta > 4 ){
                 JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO");
             }else if (repetir != 4){
                 repetir = JOptionPane.showConfirmDialog(null, "Deseja escolher novamente?");
             }
              
        }
        JOptionPane.showMessageDialog(null, "Obrigado");
        JOptionPane.showMessageDialog(null, "Alcool: " + contAlcool + " Gasolina: " + contGasolina + " Diesel: " + contDiesel);

        
            
    }
}
