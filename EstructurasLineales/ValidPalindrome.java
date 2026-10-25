package EstructurasLiniales;
/*
* ITTES TI301 2026
* AGOSTO - DICIEMBRE 2026
* ESTRUCTURA Y ORGANIZACION DE DATOS
* TEMA 2: ESTRCUTURAS LINEALES
* DOCENTE: FRANSICO JAVIER MONTESILLO PUENTE
* DESCRIPCCION :Revisar que el String s eescriba igual de izquiarda a aderecha y  de derechara a izquierda
* PROGRAMADOR : JAMC
* FEHCA: 24 / OCTUBRE /2026


* cd EstructurasLiniales
* javac ValidPalindrome.java
* java ValidPalindrome < ValidPalindrome.txt
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidPalindrome {
      String cadena;
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
        cadena = reader.nextLine();
    }

    public void resuelve() {
        String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int izquierda = 0;
        int derecha = limpia.length() - 1;

        while (izquierda < derecha) {
            if (limpia.charAt(izquierda) != limpia.charAt(derecha)) {
                System.out.println("false");
                return;
            }
            izquierda++;
            derecha--;
        }

        System.out.println("true");
    }

    public static void main(String[] args) {
        ValidPalindrome id = new ValidPalindrome();

        id.leerDatos();
        id.resuelve();
    }
}
