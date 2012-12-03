package practica11;



/**
 *
 * @author Ri
 */
public class Amigo extends Persona{


    public Amigo(){
    Nombre = "Juan Pérez"; Direccion = "P. Sherman Wallaby"; Cumple = "undefined";
    Celular = "undefined"; Email = "undefined"; Face = "undefined"; Twitter = "undefined";
    Blog = "undefined";
}


public Amigo(String n, String d, String c, String cel, String e, String f, String t, String b){
    Nombre = n; Direccion = d; Cumple = c;
    Celular = cel; Email = e; Face = f; Twitter = t;
    Blog = b;
}

    @Override
 public String toString(){

      return "Nombre: " + Nombre + " \n"+
             "Direccion: " + Direccion + " \n" +
             "Celular: " + Celular + " \n"+
             "Email: " + Email + "\n" +
             "Cumpleaños: " + Cumple + "\n" +
             "Facebook: " + Face + "\n" +
             "Twitter : " + Twitter + "\n" +
             "Blog: " + Blog;


  }


}
