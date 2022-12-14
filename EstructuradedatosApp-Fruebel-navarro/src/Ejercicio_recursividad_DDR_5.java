/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_recursividad_DDR_5 {
    
public static void main(String[] args) {
int[][] m = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
//llamada inicial
recorrerMatrizRecursivo(m, 0, 0);
}
public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {//colocamos a i y j para llamarlos en cada fila
//Muestro el numero (sin salto de linea)
System.out.print(m[i][j] + " ");
//
if (i != m.length - 1 || j != m[i].length - 1) {
//Indico si llego al final de la fila
if (j == m[i].length - 1) {
//Paso a la siguiente fila 
i++;
//Reinicio la j
j = 0;
//Salto de linea (solo formato)
System.out.println("");
} else {
//Paso a la siguiente columna
j++;
}
//Volvemos a llamar la función recursivamente
recorrerMatrizRecursivo(m, i, j);
}
}
    
}
