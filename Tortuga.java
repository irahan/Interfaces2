
/**
 * Write a description of class Tortuga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tortuga implements Mascota
{
    // instance variables - replace the example below with your own
 
    private String nombre;
    private String nombreDueno;
    private String especie;
    
    public Tortuga(String nom, String nomD, String esp){
    this.nombre = nom;
    this.nombreDueno = nomD;
    this.especie = esp;
    }
    
    public void comer(){
    System.out.println("Las tortugas comen lechuga y peces pequeños");
    }
    
    public void dormir(){
    System.out.println("Las tortugas duermen en peceras");
    }
    public void jugar(){
    System.out.println("Las tortugas no juegan con sus dueños");
    }
    
    public void setnombreDueno(String nomD){
    nombreDueno = nomD;
    }
    
    public String toString(){
    StringBuilder cad = new StringBuilder();
    cad.append("\n Nombre de la Tortuga : "+ nombre + " y le pertenece a " + nombreDueno);
    cad.append("\n" + nombre + " es de la especie " + especie ); 
   return cad.toString();
}
    
}
