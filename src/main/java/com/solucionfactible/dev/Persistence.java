package com.solucionfactible.dev;
/*
Autor: Jasiel Galvan
Fecha: 2022-04-24
*/
/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
    public static int persistence(long num) {
        if(num < 10) return 0;//Si el numero es menor a 10 retorna 0
        long aux = 1;//la variable "aux" contiene el acumulado de la multiplicacion de los numeros que componen la variable "num"
        
        //Mientras "num" sea distinto a 0 
        while(num != 0) {
            aux = aux * (num % 10);//se multiplica "aux" por el modulo/resto del numero
            num = num / 10;//Se divide "num" entre 10 para ir reduciendo hasta llegar a 0
        }
        //Se van acumulando las veces que se aplica la persistencia multiplicativa
        return 1 + persistence(aux);
    }
}
