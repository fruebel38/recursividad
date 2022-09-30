/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_recursividad_DDR_3 {
    public static void main(String[] args) {
int[] array={1,2,3,4,5}; //Se crea un arreglo donde a su vez con valor entero
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion de donde empieza( de el arreglo)
}
public static void mostrarArrayRecursivo(int[] array, int indice){
/*1º forma*/
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/
/*2º forma*/
if (indice != array.length){
//Mostramos el valor en indice declarada al principio
System.out.println(array[indice]);
//Llamamos recursivamente a la función de la segunda linea para imprimir en pantalla nuestro arreglo hasta vaciar nuestro arreglo
mostrarArrayRecursivo(array, indice+1);
}
}
    
}
