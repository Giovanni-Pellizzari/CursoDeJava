import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int numero = (int)(Math.random()*101+1);
        int valorIngresado;
        int intentos = 0;


        while(true){
            intentos++;
            System.out.print("Ingrese un número entre 1 y 100: ");
            valorIngresado = src.nextInt();
            if (valorIngresado == numero){
                System.out.println("¡Felicidades Acertaste!");
                break;
            }else {
                if (valorIngresado > numero){
                    System.out.println("Es menor");
                }else {
                    System.out.println("Es mayor");
                }
            }
        }
        System.out.println("!Sólo necesitó "+intentos+ " intentos¡");
        
    }
}