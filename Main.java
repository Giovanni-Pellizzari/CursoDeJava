import javax.swing.*;

public class Main {
    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));

        int res = num1 + num2;

        System.out.println("el resultado es: "+ res);



    }


}
