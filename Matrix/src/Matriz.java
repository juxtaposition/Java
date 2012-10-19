/**
 *
 * @author Ri
 */

import java.util.Scanner;

public class Matriz{

    private int s;
    private int r;
    private double[][] A;


    /*
     * Constructor que no recive parametros
     */

    public Matriz(){

        A = new double[0][0];

    }

    /*
     * Constructor que Recive solo un parametro
     */
    public Matriz(int c) {
        this.s = c;
        this.r = c;
     A = new double[r][s];
    }



    /*
     * Constructor que recive dos parametros rengloes y columnas
     */
    public Matriz(int c, int d){
        this.s = d;
        this.r = c;
        A = new double[r][s];
    }


public void makeMatriz(int n){
    for(int i = 0; i<n; i++){
        for(int j = 0;j<i ;j++){
        A[i][j] = 0;
    }
    }
}



/*
 * Método que despliega los valores de una matriz
 */
public void getValues(){
  for(int i = 0; i<r; i++){
        for(int j =0; j<s;j++){
     System.out.println(A[i][j]);
      }
  }
}



/*
 * @double elemento en la casilla (i,j)
 * Metodo para obtener el elemento en la posicion (i,j) de la matriz
 */
public double getValue(int a, int b){
  return A[a][b];
}


/*
 * Tamaño de la matriz Cuadrada
 */

public int length(){
    return A.length;
}



/*
 * Insercion de un elemento en la matriz,
 * @double a Elemento a insertar
 * @int b cordenada i
 * @int c cordenada j
 */

public void inserta(double a, int b, int c){
    A[b][c] = a;
}



/*
 * Método que recive una matriz como parametro y regresa la suma de ambas matrices.
 */
public void sumaMatriz(Matriz m){
  if(m.length() == A.length){
    for(int i = 0; i<A.length; i++){
        for(int j =0; j<A.length;j++){
                   A[i][j] += m.getValue(i, j);
      }
  }
  } else { System.out.println("Tiene que ser Matriz cuadrada"); }

}


/*
 * Método que recive una matriz y realiza la resta de ambas matrices
 */
public void restaMatriz(Matriz m){
  if(m.length() == A.length){
    for(int i = 0; i<A.length; i++){
        for(int j =0; j<A.length;j++){
           A[i][j] -= m.getValue(i, j);
      }

  }
    } else { System.out.println("Tiene que ser Matriz cuadrada"); }

}



/*
 * Método que recive como parametro valor en double para multiplicar
 * a la matriz por ese elemento o valor.
 */
public void productoEscalarMatriz(double s){
    for(int i = 0; i<A.length; i++){
        for(int j =0; j<A.length;j++){
           A[i][j] *= s;
      }
  }
}



/*
 * @int tamaño de los renglones
 */
public int getSizeRenglon(){
    return r;
}


/*
 * Tamaño de las columnas
 */
public int getSizeColumna(){
    return s;
}

/*
 * Método que transpone una matriz con fines de poder realizar
 * el producto de matrices de manera mas sencilla
 */
public void transpuesta(){
  double[][] trans = new double[s][r];
    for (int i = 0; i<s;i++){
        for (int j = 0; j<r;j++){
                    trans[i][j] = A[j][i];
        }
    }
int temp = s;
this.s = r;
this.r = temp;
A = trans;
}



/*
 * Método que realiza el producto punto, producto de dos matrices.
 * lo primero es ver que las matrices que nos dan se pueden multiplicar
 * de lo contrario marcamos un error o decimos que no es posible
 * Lo siguiente es crear una Matriz
 */
public Matriz productoMatriz(Matriz m){
    Matriz C = new Matriz(r,m.getSizeColumna());
    double temp;
    double tempo;
    double suma = 0.0;
    if(m.getSizeRenglon() == s){
       m.transpuesta();
        for(int i = 0; i<r; i++){
          for(int j = 0; j<m.getSizeRenglon();j++){           
            tempo = 0.0;
              for(int k = 0;k<m.getSizeColumna(); k++){
                 temp = A[i][k];
                 tempo = temp * m.getValue(j, k);
                 suma += tempo;
            }
                C.inserta(suma, i, j);
            suma = 0.0;
        }
  }
    } else { System.out.println("Tiene que ser Matriz NxM con MxN "); }
    return C;
    }



    @Override
public String toString(){
    String m = "";
     for(int i = 0; i<r; i++){
        for(int j = 0; j<s;j++){
        m = m + A[i][j] + " ";
        }
        m = m + "\n";
}
    return m;
    }



public static void main(String[] args){

   // Matriz m = new Matriz(2,3);

Scanner sc = new Scanner(System.in);
System.out.println("Inserta la cantidad de renglones que deseas: ");
  int ren = sc.nextInt();
System.out.println("Inserta la cantidad de columnas que deseas: ");
int col = sc.nextInt();
System.out.println("Recuerda que para las operaciones de suma y resta debes de\nser matrices cuadradas "
              + " Deseas crear una matriz de i: " + ren +" y j: " + col);


    Matriz m = new Matriz(2);
    //m.makeMatriz(3);
    m.inserta(2.0, 0, 0);
    m.inserta(4.0, 0, 1);
    m.inserta(6.0, 1, 0);
    m.inserta(8.0, 1, 1);
 
Matriz k = new Matriz(ren,col);

for(int i = 0; i<ren;i++){
  for(int j = 0; j<col; j++){
      k.inserta(i+j,i,j);
  }
}

System.out.println("La matriz quedara de la siguiente forma: " );
System.out.println(k.toString());



    System.out.println("Los valores de la matriz son");
    System.out.println(m.toString());
    System.out.println("Sumando la matriz anterior por si misma");
    m.sumaMatriz(m);
    System.out.println(m.toString());
    System.out.println("Producto por un escalar (9)");
    m.productoEscalarMatriz(9.0);
    System.out.println(m.toString());
    System.out.println("Restando la matriz m por si misma( deberia dar la matriz 0's)");
    m.restaMatriz(m);
    System.out.println(m.toString());
    


    System.out.println("#### Producto de matrices #### ");
    m.inserta(2.0, 0, 0);
    m.inserta(1.0, 0, 1);
 // m.inserta(0.0, 0, 2);
    m.inserta(2.0, 1, 0);
    m.inserta(1.0, 1, 1);
   // m.inserta(1.0, 1, 2);

   // Matriz n = new Matriz(3,2);
    Matriz n = new Matriz(2);

    n.inserta(1.0, 0, 0);
    n.inserta(0.0, 0, 1);
    //n.inserta(0.0,2,0);
    n.inserta(0.0, 1, 0);
    n.inserta(1.0,1,1);
    //n.inserta(1.0, 2, 1);

 System.out.println("El resultado del producto de \n" + n.toString() + " y \n"+ m.toString() + "Es: ");

   Matriz l = n.productoMatriz(m);
   System.out.println(l.toString());


}
}
