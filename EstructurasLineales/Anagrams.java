package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Resivir dos String y ver si conyiene las mismas lestras para ver si es un Anagrama
* PROGRAMADOR : JAMC
* FEHCA: 20 / OCTUBRE /2026


* cd EstructurasLiniales
* javac Anagrams.java
* java Anagrams < Anagrams.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Anagrams {
     String s;
     String t;
    FastReader reader = new FastReader();

    static class FastReader {
        // BufferedReader to read input
        BufferedReader b;
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
                return Integer.parseInt(next()); 
        }

        // Method to read Char
        char nextChar() {
            return next().charAt(0);
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
               str=b.readLine();
            } catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }

    public void leerDatos() {
        s =reader.nextLine();
        t=reader.nextLine();
    }

    public void resuelve() {
       //Si no son de la misma longuitud no son ananagramas
       if(s.length() != t.length()){
        System.out.println("No es anagrama");
        return ;
       }

       //Convertir los String en arreglos de caracter
       char [] a1=s.toCharArray();
       char [] a2=t.toCharArray();

       //Ordenamos alfabeticamente
       Arrays.sort(a1);
       Arrays.sort(a2);

       //Comprovamos si los dos arreglos son iguales
       if(Arrays.equals(a1,a2)){
        System.out.println("Si son anagramas");
       }else{
        System.out.println("No es anagrama");
       }
    }

    public static void main(String[] args) {
        Anagrams id  = new Anagrams();

        id.leerDatos();
        id.resuelve();
    }   
}

