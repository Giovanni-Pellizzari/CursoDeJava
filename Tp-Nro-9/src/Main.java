import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        Scanner gen = new Scanner(System.in);

        int pesoIdeal;
        int altura;
        String genero;
        String mujer = "mujer";
        String hombre = "hombre";

        System.out.println("Ingrese su altura en centimeros: ");
        altura = al.nextInt();
        System.out.println("Ingrese su genero (mujer / hombre): ");
        genero = gen.nextLine();

        if (genero.equals(mujer)){
            pesoIdeal = altura-120;
            System.out.println("El peso ideal es: "+pesoIdeal);
        }else if (genero.equals(hombre)){
            pesoIdeal = altura-110;
            System.out.println("El peso ideal es: "+pesoIdeal);
        }

    }

}