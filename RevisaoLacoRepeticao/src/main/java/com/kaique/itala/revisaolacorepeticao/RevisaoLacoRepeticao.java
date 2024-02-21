

package com.kaique.itala.revisaolacorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class RevisaoLacoRepeticao {

    public static void main(String[] args) {
      
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        for(int i = x; x <= 1000; i++){
            if(i % 2 != 0){
//               
                System.out.println(i);
            } 
        }
        
    }
}
