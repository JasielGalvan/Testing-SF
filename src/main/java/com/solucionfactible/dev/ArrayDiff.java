package com.solucionfactible.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Autor: Jasiel Galvan
Fecha: 2022-04-24
*/
/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
    public static int[] diff(int[] a, int[] b) {
        /*Se convierten los arreglos a listas*/
        List<Integer> arrayOne = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> arrayTwo = Arrays.stream(b).boxed().collect(Collectors.toList());
        
        return arrayOne.stream()
               .filter(x -> !arrayTwo.contains(x))//se filtran los elementos del arreglo A que no se encuentran en el arreglo B
               .mapToInt(i->i)//se mapean los elementos para devolver un arreglo tipo int
               .toArray();
    }
}
