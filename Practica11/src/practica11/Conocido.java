package practica11;


/**
 *
 * @author Ri
 */
public class Conocido extends Persona {

public Conocido(){
    Nombre = "Juan Pérez";
    Celular = "undefined";
    
}


public Conocido(String n, String cel){
    Nombre = n;
    Celular = cel;
}

   @Override
 public String toString(){

      return "Nombre: " + Nombre + " \n"+
             "Celular: " + Celular + " \n";

  }

}
