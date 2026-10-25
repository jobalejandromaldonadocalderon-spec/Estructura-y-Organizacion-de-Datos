package EstructurasLiniales;

/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Contar los numeros y cuantas veces se repite e imprir los dos numeros   ue se repiten mas
* PROGRAMADOR : JAMC
* FEHCA: 16 / OCTUBRE /2026


* cd EstructurasLiniales
* javac ContainsDuplicate.java
* java ContainsDuplicate < ContainsDuplicate.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ContainsDuplicate {
      int n;
      int  numeros[];
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
        n = reader.nextInt();
        numeros=new int[n];
        for(int i=0; i < numeros.length; i++){
            numeros[i]=reader.nextInt();
        }
    }

    public void resuelve() {
      Arrays.sort(numeros);

      int cont=1;
   
      for(int i=0; i<numeros.length; i++){
   cont++;
         if(i == numeros.length - 1 || numeros[i] != numeros[i+1]){
            System.out.println(numeros[i]+" Se repite: "+cont);
            cont=0;
        }
      }
    }

    public static void main(String[] args) {
        ContainsDuplicate id  = new ContainsDuplicate();

        id.leerDatos();
        id.resuelve();
    }   
}


