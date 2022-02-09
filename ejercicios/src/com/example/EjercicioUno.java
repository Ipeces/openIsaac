package com.example;

public class EjercicioUno {

    public static void main(String[] args) {
        //comentario
        System.out.println("Hola Mundo");
        /*comentario
        * multilínea
        * */

        //tipos de datos
        byte eByte=4;
        short eshort=10;
        int eInt= 40;
        long elong=100;

        System.out.println("números enteros byte"+ eByte+ ",short"+eshort+", Integer"+ eInt+" y long "+ elong);

        float efloat = 5.5f;
        double edouble=2.23d;

        System.out.println("números decimales float"+ efloat+ " y double"+ edouble);

        boolean eboolean=true;
        boolean eboolean2=false;

        System.out.println("booleano " + eboolean+" o "+eboolean2);

        char echar= 's';
        String cadenaPalabras =" contiene cadena de palabras";

        System.out.println("contenedor de palabras char "+ echar + " contiene una letra y string"+ cadenaPalabras);

    }
}
