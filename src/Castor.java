
public abstract class Castor implements Pata {
    protected String nombre;
    protected double velocidad;
    protected double longitudDeCola;

    public Castor(){
        
    }
    
    public Castor(double velocidad, double longitudDeCola, String nombre) {
        this.velocidad = velocidad;
        this.longitudDeCola = longitudDeCola;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public abstract void nadar();

    public abstract void tocarGuitarra();
    
    public abstract void agregarDatos();
    
    public void tocarGuitorgan(){}

}
