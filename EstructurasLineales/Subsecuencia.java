package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Dos String s y t donde la letras de S deven existir en la T si si aparecen es verdadero y si no es falso
* PROGRAMADOR : JAMC
* FEHCA: 24 / OCTUBRE /2026


* cd EstructurasLiniales
* javac Subsecuencia.java
* java Subsecuencia < Subsecuencia.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Arrays;
import java.util.StringTokenizer;

public class Subsecuencia {
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
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }

    public void leerDatos() {
        s=reader.next();
        t=reader.next();
    }


    public void resuelve() {
        
        //Covierte los String en arreglos de tipo char
      char [] a1=s.toCharArray();
      char [] a2=t.toCharArray();

       int j=0;
      for(int i=0; i < a2.length; i++){
        if(j < a1.length && a2[i] == a1[j]){
            j++;
        }
      }

      if(j == a1.length){
      
      }else{
        System.out.println("false");
      }



    }

    public static void main(String[] args) {
        Subsecuencia id  = new Subsecuencia();
        
        id.leerDatos();
        id.resuelve();
    }   
}

