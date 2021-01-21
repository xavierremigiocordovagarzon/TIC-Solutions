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
import ec.edu.espe.aricraftticketsystem.model.Admin;
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
        Airline airline = new Airline();
        Admin admin = new Admin();
        int option, option2, opcioni, opciona;
        int codeconter;
        ArrayList flights = new ArrayList();
        String convert;
        do {
            System.out.println("INICIAR SESION COMO: ");
            System.out.println("1.Administrador");
            System.out.println("2.Cliente");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");
            String opc = read.nextLine();
            opcioni = validateUse.validateNumber(opc);
            switch (opcioni) {
                case 1:
                    System.out.println("Ingrese usuario y contraseña");
                    System.out.println("Ususario: ");
                    String user = read.nextLine();
                    System.out.println("Contraseña: ");
                    String password = read.nextLine();
                    if (user.equals(admin.getUser()) && password.equals(admin.getPassword())) {
                        do {
                            System.out.println("Bienvenido sr/a: " + admin.getName());
                            System.out.println("¿Que desea hacer?");
                            System.out.println("1.Ver vuelos comprados");
                            System.out.println("2.Ver info. de cuenta");
                            System.out.println("3.Cerrar sesion");
                            System.out.println("Ingrese opcion: ");
                            String opca = read.nextLine();
                            opciona = validateUse.validateNumber(opca);
                            switch (opciona) {
                                case 1:
                                    System.out.println("==============Vuelos===========");
                                    flights = FileManager.findAll("CustomerData.json");
                                    if (flights == null) {
                                        System.out.println("Ningun Vuelo comprado");
                                        System.out.println("===============================");
                                    } else {
                                        for (int i = 0; i < flights.size(); i++) {
                                            convert = flights.get(i).toString();
                                            Customer flightconvert;
                                            flightconvert = jsoncon.fromJson(convert, Customer.class);
                                            System.out.println(flightconvert);
                                        }
                                        int quantity = flights.size();
                                        System.out.println("Numero de vuelos totales: " + quantity);
                                        System.out.println("===============================");
                                    }
                                    break;
                                case 2:
                                    System.out.println("==========Datos de Ususario=========");
                                    System.out.println("Nombre: " + admin.getName());
                                    System.out.println("Usuario: " + admin.getUser());
                                    System.out.println("Contraseña: " + admin.getPassword());
                                    System.out.println("ID: " + admin.getId());
                                    System.out.println("Telefono: " + admin.getTelephone());
                                    System.out.println("====================================");
                                    break;
                                case 3:
                                    System.out.println("=================");
                                    System.out.println("SESION CERRADA");
                                    System.out.println("=================");
                                    break;
                            }
                        } while (opciona != 3);
                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("====================================");
                        System.out.println("    BIENVENIDO A " + airline.getName());
                        System.out.println("====================================");
                        System.out.println("1. Comprar vuelos");
                        System.out.println("2. Ver vuelos comprados");
                        System.out.println("3. Ver info. de Aerolinea");
                        System.out.println("4. Salir");
                        System.out.println("Seleccione una opción: ");
                        String option1 = read.nextLine();
                        option = validateUse.validateNumber(option1);
                        System.out.println("====================================");
                        switch (option) {
                            case 1:
                                codeconter = 1;
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
                                Ticket ticketUse = new Ticket(codeconter, location);
                                Reservation reservationUse = new Reservation(date, destination, ticketUse, paymentUse);
                                Trading tradingUse = new Trading(state);
                                Customer customerUse = new Customer(name, tradingUse, id, phone, email, reservationUse);
                                convert = jsoncon.toJson(customerUse);
                                FileManager.save("CustomerData.json", convert);
                                codeconter++;
                                System.out.println("====================================");
                                System.out.println("Gracias por su compra");
                                System.out.println("====================================");
                                break;
                            case 2:
                                flights = FileManager.findAll("CustomerData.json");
                                if (flights == null) {
                                    System.out.println("=============================");
                                    System.out.println("Ningun Vuelo comprado");
                                    System.out.println("=============================");
                                } else {
                                    System.out.println("Ingrese su cedula: ");
                                    id = read.nextLine();
                                    ArrayList data = FileManager.find("CustomerData.json", "\"id\":\"" + id + "\"");
                                    System.out.println("=========DATOS DEL PASAJER0=========");
                                    for (int i = 0; i < data.size(); i++) {
                                        convert = data.get(i).toString();
                                        Customer dataconvert;
                                        dataconvert = jsoncon.fromJson(convert, Customer.class);
                                        System.out.println(dataconvert);
                                    }
                                    System.out.println("Numeros de vuelos comprados: " + data.size());
                                    System.out.println("====================================");
                                }
                                break;
                            case 3:
                                System.out.println("Nombre : " + airline.getName());
                                System.out.println("Direccion : " + airline.getDirection());
                                System.out.println("Telefono : " + airline.getTelephone());
                                break;
                            case 4:
                                System.out.println("<<==MUCHAS GRACIAS POR PREFERIRNOS==>>");
                                System.out.println("====================================");
                                break;
                            default:
                                System.out.println("Ingresar una opción valida");
                                break;
                        }
                    } while (option != 4);
                    break;
                case 3:
                    break;
            }
        } while (opcioni != 3);
    }

}
