
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato implements Mascota
{
    // instance variables - replace the example below with your own
   private String nombre;
   private String nombreDueno;
   private String raza;
   private char sex;
   
   public Gato(){
    }
    
    public Gato (String nom, String nomD, String raz, char s){
    this.nombre = nom;
    this.nombreDueno = nomD;
    this.raza = raz;
    this.sex = s;
    }
   
    public void comer(){
    System.out.println("Los gatos comen wiskas");
}

public void dormir(){
System.out.println("Los gatos duermen en su canasta o caja");
}
public void jugar(){
System.out.println("Los gatos juegan con bolas de estambre");
}

public String toString(){
StringBuilder cad = new StringBuilder();
cad.append("\n Nombre del Gato: "+ nombre + "y le pertenece a "+ nombreDueno);
cad.append(cad +"\n" + nombre + " es ");
if (sex == 'f' || sex == 'F')
cad.append("hembra");
else
 cad.append("Macho");
 cad.append("y de la raza : " +raza);
 return cad.toString();
}
}
