/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Menu {
    Scanner s = new Scanner(System.in);
    Evaluador eval = new Evaluador();
    
    
    public  void acciones(String u, String a,String nick){
        
        String h = (a.equals("admin"))?  "Sir." : "";
        System.out.println("Willkommen al Evaluador "+ h + " "+u);
        
        System.out.println("Por favor introduce una cadena a evaluar");
        String cadena = s.nextLine();
        //Evalua con evaluador.java
        eval.parentesis(cadena,u,nick,a);
      
        
    }
    
}
