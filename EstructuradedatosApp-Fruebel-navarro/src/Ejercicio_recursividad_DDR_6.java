/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_recursividad_DDR_6 {
    public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 5;
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado);
}//se imprime el resultado con respecto a la posicion del numero
public static int fibonacciRecursivo(int n) {
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
        switch (n) {
            case 0:
                return 0;
//CASO BASE, si es 1 devuelve un 1
            case 1:
                return 1;
            default:
                //Hago la suma
                return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
}
}
    

