import java.util.Random;
import java.util.Scanner;
public class OrnitorrincoAzul extends Castor {
    // dos pibes azules, pero en el main se instancian.
    
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
    double propulsion = 5 + Math.random() * 5; 
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

   
   

    
    
    
}
