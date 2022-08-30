import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RaizScanner raiz = new RaizScanner();
        raiz.imprimir();
    }

    public static class RaizScanner {
        int numero;
        double resultado;

        public void imprimir() {
            Scanner src = new Scanner(System.in);
            System.out.print("ingrese un número: ");
            numero = src.nextInt();
            resultado = Math.sqrt(numero);
            System.out.print("el cuadrado de " + numero + " es: " + resultado);
        }

    }



}