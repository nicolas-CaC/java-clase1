package clase1b;

import clase1badhoc.TiposArrays;

public class Clase1b {

    public static void main(String[] args) {
        
        TiposNumericos numericos = new TiposNumericos(2);
        TiposBooleanos booleanos = new TiposBooleanos();
        TiposCadenas cadenas = new TiposCadenas("bien");
        
        //Numeros
        System.out.println(numericos.a);
        System.out.println(numericos.b);
        System.out.println(numericos.c);
        System.out.println(numericos.d);
        
        System.out.println(numericos.e);
        System.out.println(numericos.f);
        
        System.out.println(numericos.h);
        System.out.println(numericos.i);
        
        System.out.println(numericos.g);
        
        // Booleanos
        System.out.println(booleanos.a);
        System.out.println(booleanos.b);
        
        // Cadenas
        System.out.println(cadenas.a);
        System.out.println(cadenas.b);
        System.out.println(cadenas.c);
        System.out.println(cadenas.d);
        
        // Arrays
        
        TiposArrays nuevoArray = new TiposArrays();
        TiposArrays otroArray = new TiposArrays();
        
        
        System.out.println(nuevoArray.arrayString[1]);
        System.out.println(nuevoArray.arrayNumero[3]);
        System.out.println(otroArray.arrayNumero[2]);
        System.out.println(otroArray.arrayBooleano[1]);
        System.out.println(otroArray.arrayByte[3]);
        System.out.println(nuevoArray.matriz[0][0]);
        System.out.println(nuevoArray.matriz[0][1]);
        System.out.println(nuevoArray.matriz[1][0]);
        System.out.println(nuevoArray.matriz[1][1]);
        
        byte[] x = cadenas.c.getBytes();
        System.out.println(x.length);
        
        
        
    }

}
