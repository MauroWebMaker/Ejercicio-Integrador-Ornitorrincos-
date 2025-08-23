
import java.util.Random;
import java.util.Scanner;

public class OrnitorrincoVerde extends Castor implements Pata {

    Scanner t1 = new Scanner(System.in);

    public OrnitorrincoVerde(double velocidad, double longitudDeCola) {
        super(velocidad, longitudDeCola);
    }

    @Override
    // este lo tuve que poner porque sino pedia que haga la clase sea abstracta...
    public void nadar() {
        double velocidadTotal = getVelocidad();
        System.out.println("Velocidad total de nado: " + velocidadTotal);
    }

    @Override
    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        System.out.println("Presione enter para continuar");
        t1.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }

    @Override
    public void tocarGuitarra() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }
    }

    public void tocarGuitorgan() {
        tocarOrgano();
        tocarGuitarra();
        System.out.println("--------------");
        System.out.println("Cuac Cuac!");
    }
}
