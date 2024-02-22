/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teste;

import xadrez.Bispo;
import xadrez.Cavalo;
import xadrez.Peao;

/**
 *
 * @author Aluno
 */
public class PooXadrex {

    public static void main(String[] args) {
        Peao peao = new Peao();
        Cavalo cavalo = new Cavalo();
        Bispo bispo = new Bispo();
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
        
    }
}
