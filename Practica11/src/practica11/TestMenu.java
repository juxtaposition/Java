package practica11;



/**
 * Esta clase iniciara la ejecución de la aplicación pedida para la práctica.
 * @author miguel
 */
public class TestMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


 /**
  * Cadena Bienvenida para desplegar la bienvenida en el menu()
  */
    String Bienvenida = "Bienvenido a la agenda 2012 \n "+
                    " Donde podras agregar a tus contactos \n"+
                    " de manera sencilla. \n";

  System.out.println(Bienvenida); // Desplegamos la Bienvenida

        Menu m = new Menu();
        m.menu();

    }
}
