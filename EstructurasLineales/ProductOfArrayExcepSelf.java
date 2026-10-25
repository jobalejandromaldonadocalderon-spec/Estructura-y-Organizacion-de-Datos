package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :
* PROGRAMADOR : JAMC
* FEHCA: 24 / OCTUBRE /2026


* cd EstructurasLiniales
* javac ProductOfArrayExcepSelf.java
* java ProductOfArrayExcepSelf < ProductOfArrayExcepSelf.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProductOfArrayExcepSelf {
    

    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(
                new InputStreamReader(System.in)
            );
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
        int[] answer = new int[n];
        int producto = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = producto;
            producto *= numeros[i];
        }

        producto = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= producto;
            producto *= numeros[i];
        }

        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
        ProductOfArrayExcepSelf id =
                new ProductOfArrayExcepSelf();

        id.leerDatos();
        id.resuelve();
    }
}
