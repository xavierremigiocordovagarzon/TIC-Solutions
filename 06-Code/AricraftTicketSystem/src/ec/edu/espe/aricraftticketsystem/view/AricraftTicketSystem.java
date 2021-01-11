/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.view;

import ec.edu.espe.aricraftticketsystem.model.Airline;
import java.util.Scanner;

/**
 *
 * @author George Chicango ESPE-DCCO
 */
public class AricraftTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int option;
        

        do {
            System.out.println("\n");
            System.out.println("===============================");
            System.out.println("BIENVENIDO A AEROLINEMAX");
            System.out.println("===============================");
            System.out.println("1. Comprar vuelos");
            System.out.println("2. Reservar vuelos");
            System.out.println("3. Cancelar vuelos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = read.nextInt();
            System.out.println("\n===============================");

        } while (option != 4);
        switch (option) {
            case 1:
                read.nextLine();
                System.out.print("\n\nIngrese sus apellidos y nombres: ");
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Ingresar una opción valida");
                break;
        }
    }

}
