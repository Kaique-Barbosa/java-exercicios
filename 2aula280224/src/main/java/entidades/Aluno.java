
package entidades;

/**
 *
 * @author Kaique Barbosa
 */
public class Aluno {
        public float nota1;
        public float nota2;
        public float nota3;

        
        public float totalNota(){
            return nota1 + nota2+ nota3;
        }
        
        public void status(){
            
            if(totalNota() >= 60){
                System.out.println("Parabens vc passou");
            }else{
                System.out.println("Vc reprovou");
                System.out.println("Faltam: " + String.format("%.1f", 60 - totalNota()));
            }
        }
        
        
}
