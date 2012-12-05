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
    
        ArrayList<ArrayList> listota = new ArrayList();
        ArrayList<String> listaNombre = new ArrayList();
        ArrayList<String> listaPass = new ArrayList();
        ArrayList<String> listaAdmin = new ArrayList();
        ArrayList<String> listaNick = new ArrayList();
        Boolean v = false;
        String who;

    /**
     * 
     * @param u
     * @return 
     */
    public Boolean user(String u){
        int s = listota.size();
        for(int i = 0;i<s;i++){
                    for(int j = 0;j<listota.get(i).size();j++){

           v = u.compareTo((String)listota.get(i).get(j)) == 0;
           if(v){ return v;} 
        }
                     return v;

    }

                   return v;
    }
    
    /**
     * 
     * @param u
     * @return 
     */
    public Boolean pass(String u){

     int s = listota.size();
     try{
        for(int i = 1;i<=s;i++){
                    for(int j = 0;j<listota.get(i).size();j++){
           v = u.compareTo((String)listota.get(i).get(j)) == 0;
           if(v){ return v;} 
        }
                }
                   return v;
     }catch(Exception e){ System.err.println("Has introducido un password que no existe"); logea();
     }
     return v;
    }   
    
    
     public String admin(String u){
     int s = listota.size();
        for(int i = 0;i<s;i++){
                    for(int j = 0;j<listota.get(i).size();j++){
         who = (u.compareTo((String)listota.get(i).get(j)) == 0)? (String)listota.get(2).get(j) : "NoBody" ;           
   
        if(who.compareTo("user") == 0 || who.compareTo("admin") == 0){ return who; }
        }
                    // return who;

    }

              //     return v;
        return who;
    }  
    
        public String nick(String u){
     int s = listota.size();
        for(int i = 0;i<s;i++){
                    for(int j = 0;j<listota.get(i).size();j++){
                        if(u.compareToIgnoreCase((String)listota.get(i).get(j)) == 0){
                               who = (u.compareTo((String)listota.get(i).get(j)) == 0)? (String)listota.get(3).get(j) : "NoBody" ;           
                        return who;
                        }
       
        }
                    // return who;

    }

              //     return v;
        return who;
    }  
     
     
     
     
     
     
     
     
     
     
     
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
                
                //User
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

  public void logea(){
       //Menu m = new Menu();
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Primero veamos si existe su user por favor introducelo: ");
        
            String n = sc.nextLine();

                if(user(n)){ System.out.println("Willkommen " + n + " ahora inserta tu pass");
                    String p = sc.nextLine();
                    Boolean f = (pass(p))? true : false;
                         if(pass(p)){
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
