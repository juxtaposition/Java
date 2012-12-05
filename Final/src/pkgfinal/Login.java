/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Login extends Menu{
    
        ArrayList<ArrayList> listota = new ArrayList(); // una Lista que contiene listas
        ArrayList<String> listaNombre = new ArrayList(); // Lista con los nombres
        ArrayList<String> listaPass = new ArrayList();   // Lista con los passwords
        ArrayList<String> listaAdmin = new ArrayList();  // Lista con los poderes :D!
        ArrayList<String> listaNick = new ArrayList();   // Lista con los nicks
        Boolean v = false;
        String who;    

    /**
     * Método "mal" implementado para saber si existe un usuario en nuestra
     * base de datos.
     * @param u usuario que deseamos buscar
     * @return Boolean si existe o no el usuario
     */
 public Boolean user(String u){
        int s = listota.size();
        for(int i = 0;i<s;i++){ // Busca en la primer lista. y si no en el resto :P
                    for(int j = 0;j<listota.get(i).size();j++){ // Busca en los elementos de cada lista

           v = u.compareTo((String)listota.get(i).get(j)) == 0; // Comparamos si existe el usuario.
           if(v){ return v;} 
        }
                     return v;

    }

                   return v;
    }
    
    
    
    
    /**
     * Método que se verifica el password de un usuario en caso de ser invalido
     * lo informa y lo hace logear de nuevo
     * @param u Password a verificar
     * @return Boolean si es correcto o no el password
     */
public Boolean pass(String u,String user){      
        String usuario = user; // usuario
             int s = listota.get(0).size(); // Tamaño de la la lista de users

     try{
        for(int i = 0;i<=s;i++){ // Recorres la lista de nombres en busca del usuario
            if(usuario.compareTo((String)listota.get(0).get(i)) == 0 ){ // Si lo encontramos
                /* Como los indiceis de cada usuario, es el mismo
                 * para nick, password, y poder basta con obtener su indice en 
                 * alguna lista y sabemos que su pass, etc debe estar en el mismo indice
                 * de la lista correspondiente
                 */
                v = u.compareTo((String)listota.get(1).get(i)) == 0; // Verificamos su password
                      if(v){ return v;} 
                          
            } else {  /* Nothing to Do */ }         
                    
                }
                   return v;
     }catch(Exception e){ System.err.println("Has introducido un password que no existe"); logea();
     }
     return v;
    }   
    

/**
 * Método que buscar el poder de cada usuario
 * @param u Usurio que se desea buscar el poder
 * @return String con su poder ya sea: user o admin
 */
public String admin(String u){
                    for(int j = 0;j<listota.get(0).size();j++){
         who = (u.compareTo((String)listota.get(0).get(j)) == 0)? (String)listota.get(2).get(j) : "NoBody" ;           
   
        if(who.compareTo("user") == 0 || who.compareTo("admin") == 0){ return who; }
        }
        return who;
    }  
    

/**
 * Método para obtener el nick (O Nombre completo del usuario)
 * @param u Usuario que deseamos saber su nick
 * @return String con el nick del usuario
 */
public String nick(String u){
     int s = listota.get(3).size();
     //   for(int i = 3;i<s;i++){
         for(int i = 0;i<=s;i++){
            if(u.compareTo((String)listota.get(0).get(i)) == 0 ){
                who = (String)listota.get(3).get(i);
                      return who;
                          
            } else {  /* Nothing to Do */ }         
                    
                }
                    return who;
       
        }
                   
    
/**
 * Método de cargar el archivo login, en nuestra base de dato ... llamada listas de listas.
 */     
public void leeFile(){

        int i = 0;
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("login.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por 
                String no = strLinea.split(":")[0];
                String pa = strLinea.split(":")[1];
                String ad = strLinea.split(":")[2];
                String ni = strLinea.split(":")[3];
                /**
                 *  virginia:123456:admin:Virginia Teodosio
                    norma:456234:user:Norma Pérez
                    oscar:34567:user:Oscar Ruiz
                    abraham:6666:admin:Abraham Sosa
                 */
                
               listaNombre.add(no);
               listaPass.add(pa);
               listaAdmin.add(ad);
               listaNick.add(ni);
                              
            }
               listota.add(listaNombre);
               listota.add(listaPass);
               listota.add(listaAdmin);
               listota.add(listaNick);
           
        
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e);
        }

        
  }


/**
 * Método que pide usuario y password, para poder 
 * utilizar el evaluador.
 * Si falla en el login, cuando es usuario lo saca y cuando es
 * con password le pide que vuelva a logear.
 */
public void logea(){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Primero veamos si existe su user por favor introducelo: ");
        
            String n = sc.nextLine();

                if(user(n)){ System.out.println("Willkommen " + n + " ahora inserta tu pass");
                    String p = sc.nextLine();
                   // Boolean f = (pass(p,n))? true : false;
                         if(pass(p,n)){
                        System.out.println("Acceso corretamente");
                            String w = admin(n); // Para saber si es admin o no.
                            String nick = nick(n);
                            acciones(n, w,nick);
                                } 
                        else { System.out.println("Lo sieno has fallado! "); }
           
                        } 
            else { System.out.println("Lo siento usuario no registrado");
                 }           
       
  }   
    

public static void main(String args[]) {
              Login n = new Login();
                n.leeFile();
                    n.logea();
            
             
    }

    
}
