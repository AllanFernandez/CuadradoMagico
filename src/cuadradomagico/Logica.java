/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradomagico;


/**
 *
 * @author Allan
 */
public class Logica {

       private int sumtotal;
       private int mat[][] = new int[3][3];
       private int arrResC[] = new int[3];
       private int arrResF[] = new int[3];
       private int arrResD[] = new int[2];

       public Logica() {
              sumtotal = 0;
       }

       public int[] getArrResC() {
              return arrResC;
       }

       public int[] getArrResF() {
              return arrResF;
       }

       public int[] getArrResD() {
              return arrResD;
       }

       public boolean matriz(int a, int b, int c) {
              boolean bandera = false;

              int n = c;
              for (int i = 0; i < mat.length; i++) {
                     for (int j = 0; j < mat[i].length; j++) {
                            if (n == mat[i][j]) {                                       /// recorre la Matriz buscando si el numero ingresado por parametros ya se encuentra dentro de esta
                                   bandera = true;
                            }
                     }
              }
              return bandera;
       }

       public void indatos(int a, int b, int n) {
              mat[a][b] = n;                                          /// guarda el dato ingresado dentro de la Matriz

       }

       public boolean sumaTotal() {
              boolean win = false;
              boolean banF = false;
              boolean banC = false;
              boolean banD = false;
              if (arrResC[0] == 15 && arrResC[1] == 15 && arrResC[2] == 15) {
                     banC = true;
              }
              if (arrResF[0] == 15 && arrResF[1] == 15 && arrResF[2] == 15) {
                     banF = true;
              }
              if (arrResD[0] == 15 && arrResD[1] == 15) {
                     banD = true;
              }
              if (banF == true && banC == true && banD == true) {
                     win=true;
              }
              return win;

       }

       public void sumas() {
              int sumaD = 0;
              int sumaDI = 0;
              int sumf;
              int sumc;
              for (int i = 0; i < mat.length; i++) {
                     sumf = 0;
                     for (int j = 0; j < mat[i].length; j++) {
                            sumf = sumf + mat[i][j];
                     }
                     arrResF[i] = sumf;
              }
              System.out.println("");
              //Suma columnas  
              for (int i = 0; i < mat[0].length; i++) {
                     sumc = 0;
                     for (int j = 0; j < mat.length; j++) {
                            sumc = sumc + mat[j][i];
                     }
                     arrResC[i] = sumc;
              }
              for (int i = 0; i < mat.length; i++) {
                     for (int j = 0; j < mat.length; j++) {
                            if (i == j) {
                                   sumaD += mat[i][j];
                            }
                     }
              }
              arrResD[0] = sumaD;

              for (int i = mat.length - 1; i >= 0; i--) {
                     for (int j = 0; j < mat.length; j++) {
                            if (mat.length - 1 - i == j) {
                                   sumaDI += mat[i][j];

                            }
                     }
              }
              arrResD[1] = sumaDI;
       }
}
