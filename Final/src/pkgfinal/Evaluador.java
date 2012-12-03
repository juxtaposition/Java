/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Stack;
import java.io.*;
/**
 *
 * @author root
 */
public class Evaluador {
    
    Stack<Character> p = new Stack();
    
   public void parentesis(String k,String nombre,String nick,String pow){
       int size = k.length();
       int position = 0;
       Character c = '*';
       Boolean ev = true;
      
        
       for(int i = 0;i<size;i++){
       position = i;
           c = k.charAt(i);
           if(c == '('){
        p.push(c); }
           else if(c == '['){
                p.push(c);
           }
           else if(c == '{'){
                p.push(c);
           }
           
           
           else if(c == ')'){
               
               if(p.isEmpty()){ despliega(nombre,nick,k,i,c,false); System.exit(0);}
               if(p.peek() == '('){
                   p.pop();
                  // System.out.println("Un parentesis bien balacenado");
                   
               } else { System.out.println("Parentesis mal balanceado"); 
               ev = false;
                        if(pow.compareTo("admin") == 0){
                                                    despliega(nombre,nick,k,i,c,false); System.exit(0);
                        } }
               
               
               
           }
           else if(c == ']'){
           
              if(p.isEmpty()){ despliega(nombre,nick,k,i,c,false); System.exit(0);}

               if(p.peek() == '['){
                   p.pop();
                   //System.out.println("Un corchete bien balacenado");
               } else { System.out.println("Corchete mal balanceado");   
               ev = false;
               if(pow.compareTo("admin") == 0){
                                                    despliega(nombre,nick,k,i,c,false); System.exit(0);} }
           }
           else if(c == '}'){
               
               
             if(p.isEmpty()){ despliega(nombre,nick,k,i,c,false); System.exit(0);}

               if(p.peek() == '{'){
                   p.pop();
                   //System.out.println("Una llave bien balacenado");
               } else { System.out.println("Llave mal balanceado");   
               ev = false;
               if(pow.compareTo("admin") == 0){
                                                    despliega(nombre,nick,k,i,c,false); System.exit(0);} }
           }
           else { System.out.println("Mal mal eso no es una cadena valida");  despliega(nombre,nick,k,i,c,false); System.exit(0);}
           
           
        
       }
       if(p.isEmpty()){
            if(pow.compareTo("admin") == 0){
                             
           despliega(nombre,nick,k,ev);
           
            } else {   String h = (p.isEmpty())? "Parentesis bien balanceados" : "Fallo";
       System.out.println(h);  }
       }
       else {String h = (p.isEmpty())? "Parentesis bien balanceados" : "Fallo";
       System.out.println(h); 
       despliega(nombre,nick,k,position,c,false);}
   }
   
   
   
   
   
       
   public void despliega(String name,String nick,String bal,int pos,Character p,Boolean f){
       
   File file = new File("salida"+name+".txt");
 
		try {
 
			if (file.exists()) {
 
				file.createNewFile();
			}
 
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(name+":"+nick +"\n");
                        writer.write("Expresion: "+bal+"\n");
                        
                          writer.write("Expresion Apareada: " +f+"\n");    
                        
                        
                        if(!f){ 
                            writer.write("Posicion: "+ pos+"\n");
                            if(p == ')'){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +'(');
                        }
                            else if(p == ']'){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +'[');

                            }
                             else if(p == '}'){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +'{');

                            }
                             else if(p == '('){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +')');

                            }
                             else if(p == '['){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +']');

                            }
                            else if(p == '{'){
                            writer.write("motivo: " + "Se encontro un "+p+ " y no cerro bien se esperaba un " +'}');

                            }
                        }
                            
			writer.close();
			writer = null;
                      System.exit(1);  
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
   
    public void despliega(String name,String nick,String bal,Boolean f){
       
   File file = new File("salida"+name+".txt");
 
		try {
 
			if (file.exists()) {
 
				file.createNewFile();
			}
 
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(name+":"+nick+"\n");
                        writer.write("Expresion: "+bal+"\n");
                        writer.write("Expresion Apareada: "+f+"\n");                      
			writer.close();
			writer = null;
                    System.exit(1);  
                } catch (IOException e) {
			e.printStackTrace();
		}
   }
       
   }    
     
       
       
       
    
    

