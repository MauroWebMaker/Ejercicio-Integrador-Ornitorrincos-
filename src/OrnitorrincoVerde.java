
import java.util.Random;
import java.util.Scanner;

public class OrnitorrincoVerde extends Castor implements Pata {
    Scanner t1 = new Scanner(System.in);

    public OrnitorrincoVerde(){
        
    }
    
    public OrnitorrincoVerde(double velocidad, double longitudDeCola, String nombre) {
        super(velocidad, longitudDeCola, nombre);
    }

    @Override
    public void nadar() {
        System.out.println("\n" + nombre + " nadando...\n\n");
        double velocidadTotal = getVelocidad();
        System.out.println("Velocidad total de nado: " + velocidadTotal + " km/h.");
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }

    @Override
    public void tocarOrgano() {
        System.out.println("\n" + this.nombre + " esta tocando el organo...");
        System.out.println("Do-Re-Mi");
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
        System.out.println("Fa-Sol-La-Si");
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }

    @Override
    public void tocarGuitarra() {
        Random random = new Random();
        System.out.println("\n" + this.nombre + " esta tocando el guitarra...");
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }
    
    @Override
    public void tocarGuitorgan() {
        System.out.println("\n" + this.nombre + " esta tocando el guitorgan...");
        tocarOrgano();
        tocarGuitarra();
        System.out.println("--------------");
        System.out.println("Cuac Cuac!");
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }
    
    @Override
    public void agregarDatos(){
        System.out.println("Ingrese el nombre del ornitorrinco verde: ");
        super.setNombre(t1.nextLine());
        System.out.println("Ingrese enter para continuar...");
        t1.nextLine();
        System.out.println("Ingrese la velocidad de nado de " + super.getNombre() + ": ");
        double aux = 0;
        do{
            System.out.println("(La velocidad tiene que ser de 1 a 8 km/h)");
            aux = t1.nextDouble();
        }while(aux < 1 || aux > 8);
        super.setVelocidad(aux);
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }
    
}
