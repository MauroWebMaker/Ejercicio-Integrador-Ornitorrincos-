
import java.util.Random;
import java.util.Scanner;

public class OrnitorrincoAzul extends Castor {

    // dos pibes azules (deberia tener un atributo nombre?), pero en el main se instancian.
    private double propulsion;

    Scanner t1 = new Scanner(System.in);

    public OrnitorrincoAzul(double propulsion, double velocidad, double longitudDeCola) {
        super(velocidad, longitudDeCola);
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
        double propulsion = 5 + Math.random() * 5; // aca deberiamos ponerlo como lo pide el ejercicioo, mediante entrada de scanner.
        double velocidadTotal = getVelocidad() + getPropulsion();
        System.out.println("Velocidad total de nado: " + velocidadTotal + " km/s." + "(La propulsiuon de su cola fue de: )" + getPropulsion());
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
}
