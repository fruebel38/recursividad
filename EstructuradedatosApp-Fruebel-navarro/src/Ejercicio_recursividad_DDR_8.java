/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class Ejercicio_recursividad_DDR_8 {
    
public static void main(String[] args) {
String palabra = "Hola";
System.out.println(invertirPalabra(palabra, palabra.length()-1));
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){
return palabra.charAt(longitud)+"";
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}

