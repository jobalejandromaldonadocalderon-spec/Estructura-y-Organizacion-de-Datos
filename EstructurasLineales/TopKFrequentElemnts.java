package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :En una arreglo contar los numeros repetodos e ir sumandolos y depende de K imprimir los que mas se repiten
* PROGRAMADOR : JAMC
* FEHCA: 21 / OCTUBRE /2026


* cd EstructurasLiniales
* javac TopKFrequentElemnts.java
* java TopKFrequentElemnts < TopKFrequentElemnts.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class TopKFrequentElemnts {
     int n;
     int numeros[];
     int k;
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
        k= reader.nextInt();
        numeros=new int[n];
        for(int i=0; i < numeros.length; i++){
            numeros[i]=reader.nextInt();
        }
    }

    public void resuelve() {
       Map <Integer, Integer> frecuencia=new HashMap<>();

       for(int i=0; i < numeros.length; i++){
        int num=numeros[i];

        //Vemos si existe el numero o no
        if(frecuencia.containsKey(num)){
            //Si Ya existe: Aumentar su frecuencia 1
            frecuencia.put(num, frecuencia.get(num)+1);
        }else{
            //No exisre: Guardar el numero y su frecuencia inicar en 1
            frecuencia.put(num, 1);
        }
       }

      
List<Integer> resultado = new ArrayList<>();

for (int j = 0; j < k; j++) {
    int mayor = 0;
    int numeroMayor = 0;

    for (Integer num : frecuencia.keySet()) {
        if (frecuencia.get(num) > mayor && !resultado.contains(num)) {
            mayor = frecuencia.get(num);
            numeroMayor = num;
        }
    }

    resultado.add(numeroMayor);
}

// Imprimir resultado
System.out.println(resultado);
    }

    public static void main(String[] args) {
        TopKFrequentElemnts id  = new TopKFrequentElemnts();

        id.leerDatos();
        id.resuelve();
    }   
}

