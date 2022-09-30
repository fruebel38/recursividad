/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_recursividad_DDR_4 {
    public static void main(String[] args) {
        //se declararen 3 funciones
int[] array={1,2,3,4,5};//Esta es de un areglo entero
int elementoBuscar=3;//con esta buscaremos un valor, ya otorgado
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
System.out.println(posElementoEncontrado);//Esta es para imprimir el resultado buscado
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
if(indice==array.length || array[indice]==elementoBuscar){//aqui hacemos la condiciones para buscara rreglos del 1 al 5
if(indice==array.length){
return -1;//colocamor el retorno
}else{//aqui iniciamos con las condiciones de "elementobuscar", con su return por si es que cumple
    
return indice;
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1);
//Se colocan los elementos los elementos para 
//el arreglo mientras busca el resultado para  imprimirlo
}
}
}
    

