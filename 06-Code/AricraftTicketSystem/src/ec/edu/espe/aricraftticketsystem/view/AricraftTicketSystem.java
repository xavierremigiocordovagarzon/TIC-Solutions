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
import java.util.ArrayList;
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
            System.out.println("BIENVENIDO A AEROILENEAMAX");
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
                    System.out.print("Ingrese sus apellidos y nombres: ");
                    String Cname = read.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    String Cid = read.nextLine();
                    System.out.println("Ingrese su numero telefonico: ");
                    String Cphone = read.nextLine();
                    System.out.println("Ingrese correo electronico: ");
                    String Cemail = read.nextLine();
                    System.out.println("Ingrese fecha de vuelo (DD/MM/AAAA): ");
                    String Cdate = read.nextLine();
                    System.out.println("Ingrese lugar de destino: ");
                    String Cdest = read.nextLine();
                    Reservation Cres = new Reservation(Cdate, Cdest);
                    int op;
                    do {
                        System.out.println("Seleccione ubicacion de asiento:");
                        System.out.println("1.Ventana");
                        System.out.println("2.Pasillo");
                        op = read.nextInt();
                        if (op == 1) {
                            Cs = "Ventana";
                        }  else if (op == 2) {
                            Cs = "Pasillo";
                        } else {
                            System.out.println("Ingresar opcion valida");
                        }
                                                                     
                    }  while(op <= 0 || op >= 3);
                    read.nextLine();
                    System.out.println("Ingrese numero de asietno: ");
                    int Csnumb = read.nextInt();
                    Seat Cseat = new Seat(Cs, Csnumb);
                    Ticket Cticket = new Ticket(codeconter, Cseat, 560, Cs);
                    System.out.println("Ingrese metodo de pago: ");
                    String Cpaymentmeth = read.nextLine();
                    Payment Cpay = new Payment(Cpaymentmeth, 560, 0.12F, 500);
                    int op2;
                    boolean boucher = false;
                    do {
                        System.out.println("¿Desea generar un boucher?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        op2 = read.nextInt();
                        if (op2 == 1) {
                            boucher = true;
                        } else if (op2 == 2) {
                            boucher = false;
                        } else {
                            System.out.println("Ingresar opcion valida");
                        }
                    } while (op2 <= 0 || op2 >= 3);
                    read.nextLine();
                    Trading Ctrade = new Trading(Cticket, Cpay, boucher);
                    Customer C1 = new Customer(Cname, Ctrade, Cid, Cphone, Cemail, Cres);
                    FileManager.save("CustomerData.csv", C1.toString());
                    codeconter++;
                    break;
                case 2:
                    read.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    String Cids = read.nextLine();
                    ArrayList data = FileManager.find("CustomerData.csv", Cids);
                    System.out.println(data);
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