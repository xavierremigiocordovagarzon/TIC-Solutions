/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.view;


import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.aricraftticketsystem.model.Aircraft;
import ec.edu.espe.aricraftticketsystem.model.Airline;
import ec.edu.espe.aricraftticketsystem.model.Customer;
import ec.edu.espe.aricraftticketsystem.model.Payment;
import ec.edu.espe.aricraftticketsystem.model.Reservation;
import ec.edu.espe.aricraftticketsystem.model.Seat;
import ec.edu.espe.aricraftticketsystem.model.Ticket;
import ec.edu.espe.aricraftticketsystem.model.Trading;
import ec.edu.espe.aricraftticketsystem.model.Employee;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import ec.edu.espe.validate.utils.Validate;


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
        Gson jsoncon = new Gson();
        Aircraft aircraft = new Aircraft();
        Validate validateUse = new Validate();
        String location = new String();
        String state = new String();
        Seat seat;
        int option,option2;
        int codeconter = 1;

        do {
            System.out.println("====================================");
            System.out.println("    BIENVENIDO A AEROILENEAMAX");
            System.out.println("====================================");
            System.out.println("1. Comprar vuelos");
            System.out.println("2. Ver vuelos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            String option1 = read.nextLine();
            option = validateUse.validateNumber(option1);
            System.out.println("\n====================================");
            switch (option) {
                case 1:
                    System.out.println("Ingrese sus apellidos y nombres: ");
                    String name = read.nextLine();
                    name = validateUse.validateWords(name);
                    System.out.println("Ingrese su cedula: ");
                    String id = read.nextLine();
                    id = validateUse.validateid(id);
                    System.out.println("Ingrese su numero telefonico: ");
                    String phone = read.nextLine();
                    phone = validateUse.validatephone(phone);
                    System.out.println("Ingrese correo electronico: ");
                    String email = read.nextLine();
                    email = validateUse.validateEmail(email);
                    System.out.println("Ingrese fecha de vuelo (DD/MM/AAAA): ");
                    String date = read.nextLine();
                    date = validateUse.validateDate(date);
                    System.out.println("Ingrese lugar de destino: ");
                    String destination = read.nextLine();
                    destination = validateUse.validateWords(destination);
                    System.out.println("Ingrese numero de asietno: ");
                    option1 = read.nextLine();
                    int seatNumber = validateUse.validateNumber(option1);
                    aircraft.identifyNumberSeat(seatNumber);
                    seat = new Seat(location, seatNumber);
                    do {
                        System.out.println("Seleccione ubicacion de asiento:");
                        System.out.println("1.Ventana");
                        System.out.println("2.Pasillo");
                        option1 = read.nextLine();
                        option2 = validateUse.validateNumber(option1);
                        if (option2 == 1) {
                            location = aircraft.identifyLocationSeat(option2);
                        } else if (option2 == 2) {
                            location = aircraft.identifyLocationSeat(option2);
                        } else {
                            System.out.println("Ingresar opcion valida");
                        }

                    } while (option2 <= 0 || option2 >= 3);

                    System.out.println("Ingrese metodo de pago: ");
                    String paymentMeth = read.nextLine();
                    paymentMeth = validateUse.validateWords(paymentMeth);

                    boolean voucher = false;
                    do {
                        System.out.println("¿Desea generar un boucher?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        option1 = read.nextLine();
                        option2 = validateUse.validateNumber(option1);
                        if (option2 == 1) {
                            voucher = true;
                        } else if (option2 == 2) {
                            voucher = false;
                        } else {
                            System.out.println("Ingresar opcion valida");
                        }
                    } while (option2 <= 0 || option2 >= 3);
                    Payment paymentUse = new Payment(paymentMeth, 560, 0.12F, 500);
                    Ticket ticketUse = new Ticket(codeconter,location);
                    Reservation reservationUse = new Reservation(date, destination, ticketUse, paymentUse);
                    Trading tradingUse = new Trading(state);
                    Customer customerUse = new Customer(name, tradingUse, id, phone, email, reservationUse);
                    ArrayList<Customer> customerUse2 = new ArrayList<>();
                    customerUse2.add(customerUse);
                    String convert;
                    convert = jsoncon.toJson(customerUse2);
                    FileManager.save("CustomerData.json", convert);
                    codeconter++;

                    break;
                case 2:
                    
                    System.out.println("Ingrese su cedula: ");
                    id = read.nextLine();
                    ArrayList data = FileManager.find("CustomerData.json", id);
                    System.out.println("DATOS DEL PASAJER0: \n" + data);
                    System.out.println("\n====================================");
                    
                    break;

                case 3:
                    System.out.print("<<==MUCHAS GRACIAS POR PREFERIRNOS==>>");
                    System.out.println("\n====================================");

                    break;
                default:
                    System.out.println("Ingresar una opción valida");
                    break;
            }
        } while (option != 3);
    }

}
