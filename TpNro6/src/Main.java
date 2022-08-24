public class Main {


    public static void main(String[] args) {


        double seno = Math.sin(Math.toRadians(90));
        double coseno = Math.cos(Math.toRadians(1));
        double tangente = Math.tan(Math.toRadians(45));
        double arcotangente= Math.toDegrees(Math.atan(1));
        double anguloTheta = Math.atan2(90,15);
        double exponencial = Math.exp(1);
        double logaritmo = Math.log(1);
        double PI = Math.PI;
        double e = Math.E;

        System.out.println("El seno de 90 es: "+seno);
        System.out.println("El coseno de 1 es: "+coseno);
        System.out.println("La tangente de 45 es: "+tangente);
        System.out.println("El arcotangente de 1 es: "+arcotangente);
        System.out.println("El angulo Theta entre 90 y 15 es: "+anguloTheta);
        System.out.println("EL exponencial de 1 es: "+exponencial);
        System.out.println("El logaritmo  de 1 es: "+logaritmo);
        System.out.println("El numero PI es: "+PI);
        System.out.println("El numero de Euler es: "+e);


    }
}