package practica11;



/**
 *
 * @author Ri
 */
public class Trabajo extends Persona{


    public Trabajo(){
    Nombre = "Juan Pérez"; Direccion = "P. Sherman Wallaby"; Telefono = "undefined";
    Celular = "undefined";
}


public Trabajo(String n, String d, String t,String cel){
    Nombre = n; Direccion = d; Telefono = t;
    Celular = cel;
}

   @Override
 public String toString(){

      return "Nombre: " + Nombre + " \n"+
             "Direccion: " + Direccion + " \n" +
             "Celular: " + Celular + " \n"+
             "Telefono: " + Telefono + "\n";


  }

}
