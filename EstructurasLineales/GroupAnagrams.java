package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Ver si son anagrams y agruparlos enagramas iguales
* PROGRAMADOR : JAMC
* FEHCA: 20 / OCTUBRE /2026


* cd EstructurasLiniales
* javac GroupAnagrams.java
* java GroupAnagrams < GroupAnagrams.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class GroupAnagrams {
     int n;
     String palabras[];
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
        n= reader.nextInt();
        palabras=new String[n];
        for(int i=0; i< n; i++){
            palabras[i]=reader.next();
        }
    }

    public void resuelve() {
        Map<String, List<String>> groups=new HashMap<>();
      //Recorre para obtener cada palabra
      for(int i=0; i < n; i++){
        char [] a=palabras[i].toCharArray();
        //Ordenamos las palabrass
        Arrays.sort(a);

        String clave=new String(a);

        if(groups.containsKey(clave)){
            groups.get(clave).add(palabras[i]);
        }else{
            List<String> l=new ArrayList<>();
            l.add(palabras[i]);
            groups.put(clave, l);
        }
      }

      for(List<String>l: groups.values()){
        System.out.println(l);
      }
    }

    public static void main(String[] args) {
        GroupAnagrams id  = new GroupAnagrams ();

        id.leerDatos();
        id.resuelve();
    }   
}

