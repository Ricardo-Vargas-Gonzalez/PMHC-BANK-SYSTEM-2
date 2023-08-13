package com.ByteBank.test;

/* Java.lang significa java language, se puede usar para invocar los metodos y es totalmente valido,
 * no obstante, no es necesario ya que java.lang se importa automaticamente en todos los archivos de java */
public class TestString {
    public static void main(String[] args) {
       String nombre = "Alura";
       /* Esta foorma de invocar los strings no es utilizada en la actualidad
       String nombre2 = new String("Alura");*/ 

       System.out.println("Before of methods: " + nombre);
       nombre = nombre.replace("A", "a");
       nombre = nombre.concat(" cursos online");
       System.out.println("After of 1st method: " + nombre);
       nombre = nombre.toUpperCase();
       System.out.println("After of 2nd method: " + nombre);
       nombre = nombre.toLowerCase();
       System.out.println("After of 3rd method: " + nombre);
       char letra = nombre.charAt(2);
       System.out.println("Character founded: " + letra);
       int indice = nombre.indexOf("e");
       System.out.println("Indice founded: " + indice);
       System.out.println();
    }
    public static void prinLine(String valor) {
        System.out.println(valor);
    } 
}
