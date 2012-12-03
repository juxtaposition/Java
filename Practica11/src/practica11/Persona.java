

package practica11;

/**
 * Esta clase contendrá la información de la persona.
 * @author miguel
 */
public class Persona {

/**
 * Tipos String para los atributos del Objeto Persona
 */
   public String Nombre;
   public String Direccion;
   public String Telefono;
   public String Email;
   public String Cumple;
   public String Celular;
   public String Face;
   public String Twitter;
   public String Blog;

/**
 * Constructor por omición de la clase Persona
 */
   public Persona(){
       Nombre = "Juan Pérez";
       Direccion = "Espacio Estelar";
       Telefono = "55-55-55-55-55";
       Email = "correo@dominio.com";
       Cumple = "0000-00-00";
       Celular = "52-55-00-00-00-00";
       Face = "http://facebook.com/";
       Twitter = "http://twitter.com";
       Blog = "http://wordpress.com";

   }


/**
 * Método setName para insertar un nombre al Objecto de la clase Persona
 * @param n String Nombre del Contacto
 */
  public void setName(String n){
      Nombre = n;
  }

  /**
   * Método getName para obtener el Nombre del Objecto de la clase Persona
   * @return String Nombre del Contacto
   */
  public String getName(){
      return Nombre;
  }

 /**
  * Método setDirección para insertar la dirección al Objecto de la clase Persona
  * @param Direccion String Direccion del Contacto
  */
  public void setDireccion(String Direccion){
      this.Direccion = Direccion;
  }

  /**
   * Método getDirección para obtener la Dirección del contacto
   * @return String Dirección de Contacto
   */
  public String getDireccion(){
      return Direccion;
  }

  /**
   * Método setTelefono para insertar el Telefono del contacto
   * @param t String Telefono del contacto
   */
  public void setTelefono(String t){
      Telefono = t;
  }

  /**
   * Método getTelefono para obtener el telefono del contacto
   * @return String Telefono del contacto
   */
  public String getTelefono(){
      return Telefono;
  }

  /**
   * Método setEmail para insertar el email del contacto
   * @param e String email del contacto
   */
  public void setEmail(String e){
      Email = e;
  }


  /**
   * Método getEmail para obtener el email del contacto
   * @return String email del contacto
   */
  public String getEmail(){
      return Email;
  }

  /**
   * Método setCumple para insertar la Fecha de Nacimiento del contacto
   * @param c String fecha de nacimiento del contacto
   */
  public void setCumple(String c){
      Cumple = c;
  }

  /**
   * Método getCumple para obtener la fecha de cumpleaños del contacto
   * @return String cumpleaños del contacto
   */
  public String getCumple(){
      return Cumple;
  }

  /**
   * Método para insertar el facebook de una persona
   * @param f String Direccion de FaceBook
   */
  public void setFace(String f){
        Face = f;
  }

  /**
   * 
   * @return String Direccion de Facebook de una persona
   */
  public String getFace(){
      return Face;
  }

  /**
   * Método para insertar el perfil en Twitter de un usuario.
   * @param t String direccion del perfil en Twitter de un usuario
   */
  public void setTwitter(String t){
      Twitter = t;
  }

  /**
   * Método para obtener la direccion del perfil en Twitter de un usuario
   * @return direccion de Twitter
   */
  public String getTwitter(){
      return Twitter;
  }

  /**
   * Método para insertar el teléfono Ceular de un usuario
   * @param c String Teléfono Celular de un usuario
   */
  public void setCelular(String c){
      Celular = c;
  }

  /**
   * Método para obtener el teléfono celular
   * @return String teléfono celular del usuario
   */
  public String getCeluar(){
      return Celular;
  }


  /**
   * Método para Insertar la direccion de blog
   * @param b String blog del usuario
   */
  public void setBlog(String b){
      Blog = b;
  }



  /**
   * Método para obtener la direcion del de blog
   * @return String blog
   */
  public String getBlog(){
      return Blog;
  }


 

}
