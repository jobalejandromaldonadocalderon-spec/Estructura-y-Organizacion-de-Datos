package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Ver cual tiene la mayor secuencia mas larga
* PROGRAMADOR : JAMC
* FEHCA: 24 / OCTUBRE /2026


* cd EstructurasLiniales
* javac LongestConsecutiveSequence.java
* java LongestConsecutiveSequence < LongestConsecutiveSequence.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class LongestConsecutiveSequence {
   
    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreTokens()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    FastReader reader = new FastReader();
    int n;
    int[] numeros;

    public void leerDatos() {
        n = reader.nextInt();
        numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = reader.nextInt();
        }
    }

    public void resuelve() {
        Set<Integer> conjunto = new HashSet<>();

        for (int num : numeros) {
            conjunto.add(num);
        }

        int mayorLongitud = 0;

        for (int num : conjunto) {
            // Solo comenzamos cuando no existe el número anterior.
            if (!conjunto.contains(num - 1)) {
                int actual = num;
                int longitud = 1;

                while (conjunto.contains(actual + 1)) {
                    actual++;
                    longitud++;
                }

                mayorLongitud = Math.max(mayorLongitud, longitud);
            }
        }

        System.out.println(mayorLongitud);
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence programa =
                new LongestConsecutiveSequence();

        programa.leerDatos();
        programa.resuelve();
    }
}