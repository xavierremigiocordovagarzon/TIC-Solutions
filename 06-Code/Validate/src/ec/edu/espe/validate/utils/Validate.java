/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.validate.utils;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class Validate {

    public int validateNumber(String number) {

        Scanner read = new Scanner(System.in);
        boolean state;
        int number1 = 0;

        do {
            try {
                number1 = Integer.parseInt(number);
                state = true;
            } catch (NumberFormatException error) {
                state = false;
            }
            if (state == false) {
                System.out.println("Seleccione una opción correcta: ");
                number = read.nextLine();
            }

        } while (state == false);

        return number1;
    }

    public String validateWords(String words) {
        Scanner read = new Scanner(System.in);
        char caracter;
        boolean state = false;
        do {
            for (int i = 0; i < words.length(); i++) {
                caracter = words.toUpperCase().charAt(i);
                int valorASCII = (int) caracter;
                if (caracter == ' '){
                    state = true;
                } else if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
                    state = false;
                    i = words.length();
                    System.out.println("Ingrese datos validos: ");
                    words = read.nextLine();
                } else {
                    state = true;
                }
            }
        }while(state == false);
        
        
        return words;
    }

}