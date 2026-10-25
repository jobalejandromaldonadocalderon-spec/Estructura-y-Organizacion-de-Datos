package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION : Encontar dos numeros que sumados sean iguala a un target en un arreglo (METODO OPTIMO TWO POINS)
* PROGRAMADOR : JAMC
* FEHCA: 16 / OCTUBRE /2026


* cd EstructurasLiniales
* javac TwoSum.java
* java TwoSum < TwoSum.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoSum {
     int n;
 int target;
 int numeros[];
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
        target=reader.nextInt();
        numeros=new int[n];
        for(int i=0; i < numeros.length; i++){
            numeros[i]=reader.nextInt();
        }
    }

    public void resuelve() {
           Arrays.sort(numeros);
       int left=0;
       int right=numeros.length - 1;
     while(left < right){
        int suma=numeros[left] + numeros[right];
        if(suma == target){
            System.out.println("Los numeros son: "+numeros[left] +" "+numeros[right]);
            System.out.println("Target: "+target);
            break;
        }else if(suma > target){
            right--;
        }else if(suma < target){
            left++;
        }
     }
    }

    public static void main(String[] args) {
        TwoSum id  = new TwoSum();

        id.leerDatos();
        id.resuelve();
    }   
}


