package com.solucionfactible.dev;
/*
Autor: Jasiel Galvan
Fecha: 2022-04-24
*/
/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
    public static boolean isValid(String pin) {
        /*Se valida si es numero valido*/
        if(isNum(pin)){
            /*Si es un numero valido procede a validar si la longitud de la cadena es 4 o 6*/
            return (pin.length() == 4 || pin.length() == 6);
        }else{
            /*En caso de no ser un numero valida retorna Falso*/
            return false;
        }
    }
    /*El metodo isNum, verifica si la cadena que recibe es un entero o no.*/
    public static boolean isNum(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
