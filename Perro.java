
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro implements Mascota
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String raza;
    private int edad;
    
    public Perro(){
    }
    
    public Perro(String nom, String ra, int e){
    this.nombre = nom;
    this.raza = ra;
    this.edad = e;
    }
    
    public void comer(){
    System.out.println(" Los perros comen croquetas DogChaw, Pedigre");
    }
    public void dormir(){
    System.out.println("Los perros duermen en su cama o su caja ");
    }
    public void jugar(){
    System.out.println(" Los peros les gusta correr o  nadar , persiguir la pelota");
    }
    
    public String toString(){
    StringBuilder cad = new StringBuilder();
    cad.append("\n\n Nombre del perro: " + nombre);
    cad.append("\n Es de la  raza "+ raza + " y tiene " + edad + "años");
    return cad.toString();
    }
}
