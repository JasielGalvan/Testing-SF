package com.solucionfactible.dev;

import java.util.stream.IntStream;
/*
Autor: Jasiel Galvan
Fecha: 2022-04-24
*/
/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
    public static char findMissingLetter(char[] array) {
        /*Se usa el codigo ASCII para trabajar con los valores numericos de cada caracter*/
        char missLetter = IntStream.range(0, array.length - 1)
        .filter(x -> array[x]+1 != array[x+1])//Se suma 1 al valor del primer elemento y se valida que sea distinto al valor del siguiente
        .mapToObj(x -> (char)(array[x]+1))//Se mapean los elementos como tipo char
        .findAny().orElse(' ');//En caso de que no encuentre nada, devuelve ' ' 
        
        return missLetter;
    }
}
