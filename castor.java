
public class castor {
    //superclase esta

    private double velocidad;
    private double longitudDeCola;

    public Castor(double velocidad, double longitudDeCola) {
        this.velocidad = velocidad;
        this.longitudDeCola = longitudDeCola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getLongitudDeCola() {
        return longitudDeCola;
    }

    public void setLongitudDeCola(double longitudDeCola) {
        this.longitudDeCola = longitudDeCola;
    }
    
    public void nadar (){
        System.out.println("Nada a la velocidad de " + velocidad + "km/hora");  
    }
    
    public void tocarGuitarra (){
    }

    
}


