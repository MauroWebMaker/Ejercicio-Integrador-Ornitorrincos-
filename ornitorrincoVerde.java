
import java.util.Random;
import java.util.Scanner;


public class OrnitorrincoVerde extends castor implements Pata{
    Scanner t1 = new Scanner (System.in);
    
    public OrnitorrincoVerde(){
        
    }
        
    
    
    public void tocarGuitorgan(){
        
     @Override   
     public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        System.out.println("Presione enter para continuar");
        t1.nextLine();
        System.out.println("Fa-Sol-La-Si");
        
        
        
        @Override
        public void tocarGuitarra() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1; 
            System.out.println("toca cuerda " + cuerda);
        }
    }
         }
        System.out.println("--------------");
        System.out.println("Cuac Cuac!");

    }
    
    //unito solo de este, pero hereda bastante de ambos padres
}
