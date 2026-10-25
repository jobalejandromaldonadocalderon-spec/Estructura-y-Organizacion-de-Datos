package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Encontrar dos numeros sumados den el target devolviendo su pocicion
* PROGRAMADOR : JAMC
* FEHCA: 24 / OCTUBRE /2026


* cd EstructurasLiniales
* javac TwoSum2.java
* java TwoSum2 < TwoSum2.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoSum2 {
      int n;
    int target;
    int[] numeros;
    FastReader reader = new FastReader();

    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

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

        int nextInt() {
            return Integer.parseInt(next());
        }

        char nextChar() {
            return next().charAt(0);
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (s != null && s.hasMoreTokens()) {
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
        numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = reader.nextInt();
        }

        target = reader.nextInt();
    }

    public void resuelve() {
        int izquierda = 0;
        int derecha = n - 1;

        while (izquierda < derecha) {
            int suma = numeros[izquierda] + numeros[derecha];

            if (suma == target) {
                System.out.println((izquierda + 1) + " " + (derecha + 1));
                return;
            } else if (suma < target) {
                izquierda++;
            } else {
                derecha--;
            }
        }
    }

    public static void main(String[] args) {
        TwoSum2 id = new TwoSum2();

        id.leerDatos();
        id.resuelve();
    }
}
