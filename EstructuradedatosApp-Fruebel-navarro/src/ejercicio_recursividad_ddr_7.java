/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fruebel
 */
public class ejercicio_recursividad_ddr_7 {
    
public static void main(String[] args) {
int a = 254; //400 + 50 + 2
System.out.println(invertirNum(a, 2));
}
public static int invertirNum(int num, int pos){
//Si es menor que 10 devuelvo el numero (el ultimo numero)
if(num < 10){
return num;
}else{
//modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo.math.poe hace eso
return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
}
}
}