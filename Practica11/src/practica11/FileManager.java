/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;
import java.io.*;        
import java.util.Scanner;        

/**
 *
 * @author root
 */
public class FileManager {
    
private final File f;
    
/**
 * Constructor 
 * @param aPath Ruta al archivo
 */
  public FileManager(String aPath){
      f = new File(aPath);
  }
    
  public final void readFile() throws FileNotFoundException{
      Scanner s = new Scanner(new FileReader(f));
      
      try {
          while(s.hasNextLine()){
              
              imprime(s.nextLine());
              
             }  
            
          
      }
      catch(Exception e){ System.out.println("Algo paso"); System.err.print(e.toString());
      }
      finally {
          s.close();
      }
      
      
  }
  
   private void imprime(String n) throws Exception {
        Scanner ss = new Scanner(n);
               ss.useDelimiter("=");
             if(ss.hasNext()){
                    
                String name = ss.next();
                String value = ss.next();
        
             System.out.println("Nombre :"+ name.trim() + " Valor: " + value.trim());
             } else { }
   }
  
  
    public static void main(String... aArgs) throws FileNotFoundException {
    FileManager parser = new FileManager("test.txt");
   parser.readFile();
   
   
  }

   
    
}
