
import java.util.Random;
import java.util.Scanner;

public class OrnitorrincoAzul extends Castor {
    private double propulsion;

    Scanner t1 = new Scanner(System.in);
    
    public OrnitorrincoAzul(){
        
    }
    
    public OrnitorrincoAzul(double propulsion, double velocidad, double longitudDeCola, String nombre) {
        super(velocidad, longitudDeCola, nombre);
        this.propulsion = propulsion;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getLongitudDeCola() {
        return longitudDeCola;
    }

    @Override
    public void setLongitudDeCola(double longitudDeCola) {
        this.longitudDeCola = longitudDeCola;
    }

    @Override
    public void nadar() {
        System.out.println("\n" + nombre + " nadando...\n\n");
        System.out.println("Ingrese la propulsion de " + nombre + ": ");
        System.out.println("(La propulsion debe ser entre 5 y 10)");
        double pr = 0;
        do{
            pr = t1.nextDouble();
        }while(pr < 5 || pr > 10);
        this.propulsion = pr;
        double velocidadTotal = getVelocidad() + getPropulsion();
        System.out.println("Velocidad total de nado: " + velocidadTotal + " km/h." + " La propulsiuon de su cola fue de:" + getPropulsion() + " km/s.");
    }

    @Override
    public void tocarGuitarra() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }
    }

    @Override
    // lo saque de OrnitorrincoVerde, y ni idea porque me deja, no esta implementada pata aca JAJAJ

    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        System.out.println("Presione enter para continuar");
        t1.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
    @Override
    public void agregarDatos(){
        System.out.println("Ingrese el nombre del ornitorrinco azul: ");
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
    }
}
