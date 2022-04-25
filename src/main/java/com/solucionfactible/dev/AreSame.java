package com.solucionfactible.dev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Autor: Jasiel Galvan
Fecha: 2022-04-24
*/
/**
 * comp checks whether the two arrays have the "same" elements, with the same * multiplicities. "Same" means,
 * here, that the elements in b are the elements in a squared, regardless of the order.
 *
 * @author developer
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        /*Convertimos los arreglos "a" y "b" en listas*/
        List<Integer> listOne = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(b).boxed().collect(Collectors.toList());
        
        /*A la lista "a" le aplicamos un filtro para recorrer cada elemento y 
        buscarlo en la lista "b", la lista "b" debe de contener el valor del elemento "a" al mulplicarlo por si mismo.
        En caso de que no se encuentre ese valor en la lista B, se incrementa el contador
        y por tanto al aplicar la validacion obtendremos un false*/
        return listOne.stream().filter(x -> !listTwo.contains(x*x)).count() == 0;
    }
}
