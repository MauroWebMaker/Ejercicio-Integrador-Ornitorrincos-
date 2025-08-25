
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);

        Castor o1 = new OrnitorrincoVerde();
        Castor o2 = new OrnitorrincoAzul();
        Castor o3 = new OrnitorrincoAzul();

        o1.agregarDatos();
        o2.agregarDatos();
        o3.agregarDatos();

        o1.nadar();
        o2.nadar();
        o3.nadar();

        o1.tocarOrgano();
        o1.tocarGuitarra();
        o1.tocarGuitorgan();

        o2.tocarGuitarra();
        o2.tocarOrgano();

        o3.tocarGuitarra();
        o3.tocarOrgano();

        Castor[] familiaUnida = new Castor[3];
        try {
            familiaUnida[0] = o1;
            familiaUnida[1] = o2;
            familiaUnida[2] = o3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: te saliste del rango del arreglo. " + e.getMessage());
            System.out.println("Presione enter para continuar...");
            t1.nextLine();
        } finally {
            System.out.println("Los ornitohermanos juntos al fin...");
            System.out.println("Presione enter para continuar...");
            t1.nextLine();
        }
        
        //Velocidad total Lista
        
        List<Castor> nadadores = new ArrayList<>();
        nadadores.add(o1);
        nadadores.add(o2);
        nadadores.add(o3);
       
        Collections.sort(nadadores, new Comparator<Castor>(){
            @Override
            public int compare(Castor c1, Castor c2){
                return Double.compare(c2.getVelocidad(), c1.getVelocidad());
            }
        });
        
        nadadores.remove(2);
        System.out.println("\n Los mas rapidos son: ");
        for (Castor x : nadadores) {
            System.out.println(x.getNombre() + " con una velocidad de: "+ x.getVelocidad()+" km/h");
        }
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
        
        //Propulsion total lista
 
        List<Castor> propulsion = new ArrayList<>();
        propulsion.add(o2);
        propulsion.add(o3);
       
        Collections.sort(propulsion, new Comparator<Castor>(){
            @Override
            public int compare(Castor c1, Castor c2){
                return Double.compare(((OrnitorrincoAzul)c1).getPropulsion(), ((OrnitorrincoAzul)c2).getPropulsion());
            }
        });

        Iterator<Castor> it = nadadores.iterator();
        System.out.println("\n Por Propulsion ordenados ascendentemente son: ");
        while(it.hasNext()){
            Castor nadadore = it.next();
            System.out.println(nadadore.getNombre() + ", Propulsion: " + ((OrnitorrincoAzul)nadadore).getPropulsion());
        }
        System.out.println("Presione enter para continuar...");
        t1.nextLine();
    }
}
