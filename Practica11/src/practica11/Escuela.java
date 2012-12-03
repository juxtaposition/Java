package practica11;

/**
 *
 * @author Ri
 */
public class Escuela extends Persona{


    public Escuela(){
    Nombre = "Juan Pérez"; Direccion = "P. Sherman Wallaby"; Email = "undefined";
    Celular = "undefined";
}


public Escuela(String n, String d, String t,String cel){
    Nombre = n; Direccion = d; Email = t;
    Celular = cel;
}

   @Override
 public String toString(){

      return "Nombre: " + Nombre + " \n"+
             "Direccion: " + Direccion + " \n" +
             "Celular: " + Celular + " \n"+
             "Email: " + Email + "\n";


  }

}