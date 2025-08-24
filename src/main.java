public class main {
    public static void main(String[] args) {
        
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
        try{
            familiaUnida[0] = o1;
            familiaUnida[1] = o2;
            familiaUnida[2] = o3;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: te saliste del rango del arreglo. " + e.getMessage());
        }finally{
            System.out.println("Los ornitohermanos juntos al fin...");
        }
    }
}
