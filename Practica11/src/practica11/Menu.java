package practica11;


import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta clase contendrá al menu de la aplicación, la cuál al crear un objeto de
 * esta y ser llamado el método menu(), iniciará un menú para la interacción con
 * el usuario
 *
 * @author miguel
 */
public class Menu {


   int contador = 0;
   //Object[] sim = new Object[2];
   ArrayList sim = new ArrayList();

     private String n; // Nombre
     private String d; // Dirección
     private String t; // Teléfono
     private String cel; // Celular
     private String e; // Email
     private String c; // Fecha de Nacimiento
     private String face; // facebook
     private String twitter; // Twitter
     private String blog; // Blog



    /**
     * Método menu que deplegara toda la información y además pedira los datos.
     */
    public void menu() {
    Scanner sc = new Scanner(System.in);

 
/**
 *  Preguntamos al usuario que desea hacer.
 */
    System.out.println("Que deseas hacer? \n para desplegar los contactos"
            + " existentes presiona 1, \n para insertar un contacto presiona 2 \n Para salir presiona 3");

    int wat = sc.nextInt();

    /**
     * Iniciamos un Switch para verificar que selecciono el usuario
     */
    switch (wat){

        case 1: // Quiere sólo desplegar los contactos existentes
	
    System.out.println("########## Contacto 1: ##########");

    for(int i = 0;i<sim.size();i++){
        System.out.println(sim.get(i).toString());
            }

            menu();
        break;

        case 2: // Desea insertar un contacto nuevo

            if(contador == 2){
                System.out.println("        ###### AGENDA AL TOPE ######           ");
                menu();
            } 

     /**
      * Preguntamos a que contacto desea agregar o modificar,
      * seleccionando del 1 al 5, siendo 1 el primer contacto y
      * 5 siendo el quinto contacto.
      */
        System.out.println("Tu contacto es un: \n"
                + "Amigo [1], Compañero de la Oficina [2] , Compañero de la escuela [3] \n "
                + "Conocido [4] \n");
        
        int donde = sc.nextInt();
            switch (donde){

                case 1:

                  Amigo a =  new Amigo();

                    /**
                     * Selecciono al contacto 1 y ahora debemos pedir los datos correspondientes
                     * al objeto de la clase Persona
                     */
        	System.out.println(" #### Amigo #### : \n inserta los valores");
        	System.out.println("");
       		String Null = sc.nextLine(); // Sentencia inútil para envitar saltos con Scanner


        System.out.println("Inserta el Nombre: ");
        n = sc.nextLine();
        a.setName(n);

        System.out.println("Inserta la Dirección: ");        
        d = sc.nextLine();
        a.setDireccion(d);

        System.out.println("Inserta la Fecha de Nacimiento: ");
        c = sc.nextLine();
        a.setCumple(c);

        System.out.println("Inserta el Teléfono Celular: ");
        cel = sc.nextLine();
        a.setCelular(cel);

        System.out.println("Inserta el Email: ");
        e = sc.nextLine();
        a.setEmail(e);

        System.out.println("Inserta tu página de facebook: ");
        face = sc.nextLine();
        a.setFace(face);

        System.out.println("Inserta tu página de twitter: ");
        twitter = sc.nextLine();
        a.setTwitter(twitter);

        System.out.println("Inserta tu blog: ");
        blog = sc.nextLine();
        a.setBlog(blog);

            sim.add(a);

        menu();
        break;

                case 2:
          Trabajo office = new Trabajo();

        System.out.println(" #### Compañero de la Oficina #### : \n inserta los valores");
        System.out.println("");
        String Null2 = sc.nextLine(); // Sentencia inútil para envitar saltos con Scanner

        System.out.println("Inserta el Nombre: ");
        n = sc.nextLine();
        office.setName(n);

        System.out.println("Inserta la Dirección: ");
        d = sc.nextLine();
        office.setDireccion(d);

        System.out.println("Inserta el Teléfono: ");
        t = sc.nextLine();
        office.setTelefono(t);

        System.out.println("Inserta el Celular: ");
        cel = sc.nextLine();
        office.setCelular(cel);

        sim.add(office);

        menu();
        break;

                case 3:
                Escuela esc = new Escuela();

        System.out.println(" #### Compalero de la Escuela #### : \n inserta los valores");
        System.out.println("");
        String Null3 = sc.nextLine(); // Sentencia inútil para envitar saltos con Scanner


        System.out.println("Inserta el Nombre: ");
        n = sc.nextLine();
        esc.setName(n);

        System.out.println("Inserta la Dirección: ");
        d = sc.nextLine();
        esc.setDireccion(d);

        System.out.println("Inserta el Celular: ");
        cel = sc.nextLine();
        esc.setCelular(cel);

        System.out.println("Inserta el Email: ");
        e = sc.nextLine();
        esc.setEmail(e);
        
        sim.add(esc);


        menu();
        break;

                case 4:
                Conocido foo = new Conocido();

        System.out.println(" #### Conocido #### : \n inserta los valores");
        System.out.println("");
        String Null4 = sc.nextLine(); // Sentencia inútil para envitar saltos con Scanner

        System.out.println("Inserta el Nombre: ");
        n = sc.nextLine();
        foo.setName(n);

        System.out.println("Inserta el Celular: ");
        cel = sc.nextLine();
        foo.setCelular(cel);

        sim.add(foo);


        menu();
        break;
               
        } // End del segundo Switch
        break;

        case 3:

          System.exit(0); // Terminamos la ejecición del programa
        break; //
        } // End del primer Switch
    }
}
    

