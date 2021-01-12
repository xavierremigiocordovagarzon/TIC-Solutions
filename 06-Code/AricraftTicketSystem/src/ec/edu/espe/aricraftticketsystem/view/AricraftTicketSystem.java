/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.view;

import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.aricraftticketsystem.model.Airline;
import ec.edu.espe.aricraftticketsystem.model.Customer;
import ec.edu.espe.aricraftticketsystem.model.Payment;
import ec.edu.espe.aricraftticketsystem.model.Reservation;
import ec.edu.espe.aricraftticketsystem.model.Seat;
import ec.edu.espe.aricraftticketsystem.model.Ticket;
import ec.edu.espe.aricraftticketsystem.model.Trading;
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
        int codeconter = 1;
        String Cs = null;
        do {
            System.out.println("\n");
            System.out.println("===============================");
            System.out.println("BIENVENIDO A AEROLINEMAX");
            System.out.println("===============================");
            System.out.println("1. Comprar vuelos");
            System.out.println("2. Cancelar vuelos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = read.nextInt();
            System.out.println("\n===============================");
            switch (option) {
                case 1:
                    read.nextLine();
                    System.out.print("\nIngrese sus apellidos y nombres: ");
                    String Cname = read.nextLine();
                    System.out.println("\nIngrese su cedula: ");
                    int Cid = read.nextInt();
                    System.out.println("\nIngrese su numero telefonico: ");
                    int Cphone = read.nextInt();
                    System.out.println("\nIngrese correo electronico: ");
                    String Cemail = read.nextLine();
                    System.out.println("\nIngrese fecha de vuelo (DD/MM/AAAA): ");
                    String Cdate = read.nextLine();
                    System.out.println("\nIngrese lugar de destino: ");
                    String Cdest = read.nextLine();
                    Reservation Cres = new Reservation(Cdate, Cdest);
                    System.out.println("\nSeleccione ubicacion de asiento:");
                    System.out.println("1.Ventana");
                    System.out.println("2.Pasillo");
                    int op = read.nextInt();
                    if (op == 1) {
                        Cs = "Ventana";
                    } else {
                        Cs = "Pasillo";
                    }
                    System.out.println("\nIngrese numero de asietno: ");
                    int Csnumb = read.nextInt();
                    Seat Cseat = new Seat(Cs, Csnumb);
                    Ticket Cticket = new Ticket(codeconter, Cseat, 560, Cs);
                    System.out.println("\nIngrese metodo de pago: ");
                    String Cpaymentmeth = read.nextLine();
                    Payment Cpay = new Payment(Cpaymentmeth, 560, (float) 0.12, 500);
                    System.out.println("\n¿Desea generar un boucher?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    int op2 = read.nextInt();
                    boolean boucher;
                    if (op2 == 1) {
                        boucher = true;
                    } else {
                        boucher = false;
                    }
                    Trading Ctrade = new Trading(Cticket, Cpay, boucher);
                    Customer C1 = new Customer(Cname, Ctrade, Cid, Cphone, Cemail, Cres);
                    FileManager.save("CustomerData.txt", C1.toString());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Ingresar una opción valida");
                    break;
            }
        } while (option != 3);
    }

}
