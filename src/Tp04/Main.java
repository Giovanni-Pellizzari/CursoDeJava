package Tp04;

import javax.swing.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Declaración de la variable tipo String utilizando JOptionPane//
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");


        //Declaración de la variable tipo int utilizando JOptionPane//
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));


        //Declaración de la variable tipo float utilizando JOptionPane//
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario deseado: "));


        //Declaración de la variable tipo boolean utilizando JOptionPane//
        if (JOptionPane.showConfirmDialog(null," ¿Posee carnet? "+ JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.out.println("Posee carnet");
        }else {
            System.out.println("No Posee carnet");
        }

        System.out.println("Nombre: "+ nombre);

        System.out.println("Edad: "+ edad);

        System.out.println("Salario deseado:"+ salario);









    }
}