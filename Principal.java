
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
    Tortuga miTortuga = new Tortuga("Amazon","Juan","Lora");
    Perro miPerro = new Perro("Maximus","Doberman",2);
    Gato miGato = new Gato("michu","Vecina","Angora",'M');
    
    miTortuga.comer();
    miTortuga.dormir();
    miTortuga.jugar();
    System.out.println(miTortuga.toString());
    }
}
