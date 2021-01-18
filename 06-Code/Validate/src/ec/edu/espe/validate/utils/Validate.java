/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.validate.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                if (caracter == ' ') {
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
        } while (state == false);

        return words;
    }

    public String validatephone(String phone) {
        Scanner read = new Scanner(System.in);
        boolean state = false;
        char caracter, caracterUse;
        do {
            caracter = phone.toUpperCase().charAt(0);
            caracterUse = phone.toUpperCase().charAt(1);
            int valorASCII = (int) caracter;
            if (phone.matches("[0-9]*") && 10 == phone.length() && caracter == '0') {
                if (caracterUse == '9') {
                    state = true;
                } else {
                    state = false;
                }

            } else {
                System.out.println("Numero incorrecto, ingrese de nuevo:");
                phone = read.nextLine();
                state = false;
            }
        } while (state == false);

        return phone;
    }

    public String validateid(String id) {
        Scanner read = new Scanner(System.in);
        boolean state = false;
        do {
            try {

                if (id.length() == 10) {
                    int thirdDigit = Integer.parseInt(id.substring(2, 3));
                    if (thirdDigit < 6) {
                        int[] validate = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                        int checker = Integer.parseInt(id.substring(9, 10));
                        int sum = 0;
                        int digit = 0;
                        for (int i = 0; i < (id.length() - 1); i++) {
                            digit = Integer.parseInt(id.substring(i, i + 1)) * validate[i];
                            sum += ((digit % 10) + (digit / 10));
                        }

                        if ((sum % 10 == 0) && (sum % 10 == checker)) {
                            state = true;
                        } else if ((10 - (sum % 10)) == checker) {
                            state = true;
                        } else {
                            state = false;
                        }
                    } else {
                        state = false;
                    }
                } else {
                    state = false;
                }
            } catch (NumberFormatException nfe) {
                state = false;
            } catch (Exception err) {
                System.out.println("Una excepcion ocurrio en el proceso de validadcion");
                state = false;
            }

            if (!state) {
                System.out.println("Id invalida, ingrese de nuevo:");
                id = read.nextLine();
                state = false;
            }
        } while (state == false);

        return id;
    }

    public String validateEmail(String email) {
        Scanner read = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        boolean state = false;
        do {
            Matcher mather = pattern.matcher(email);

            if (mather.find() == true) {
                state = true;
            } else {
                System.out.println("Email inválido, ingrese de nuevo:");
                email = read.nextLine();
                state = false;
            }
        } while (state == false);

        return email;
    }

    public String validateDate(String date) {
        Scanner read = new Scanner(System.in);
        boolean state = false;

        do {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);
                dateFormat.parse(date);
            } catch (ParseException e) {
                state = false;
                System.out.println("Fecha inválida, ingrese de nuevo:");
                date = read.nextLine();
                state = false;
            }
            state = true;

        } while (state == false);

        return date;
    }

}
