/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Filemanager.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Buse ESPE-DCCO
 */
public class FileManager {

    public static void save(String fileName, String data) {
        //TODO saving data in the file FileName
        FileWriter file;
        BufferedWriter write;
        try {
            File f = new File(fileName);

            file = new FileWriter(fileName, true);
            if (f.exists()) {
                write = new BufferedWriter(file);
                write.write(data);
                write.write("" + "\n");
                write.close();

            } else {
                file = new FileWriter(fileName, true);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList find(String fileName, String dataToFind) {
        //TODO finding dataToFind in file fileName
        ArrayList lineretrived = new ArrayList();
        String line;
        FileReader readFile;
        BufferedReader read;
        boolean verify = false;
        try {
            readFile = new FileReader(fileName);
            read = new BufferedReader(readFile);

            while ((line = read.readLine()) != null) {
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (data[i].equals(dataToFind)) {
                        verify = true;
                        lineretrived.add(line + "\n");
                    }

                }
            }
            if (verify == false) {
                System.out.println("Dato no encontrado");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        //return line;
        return lineretrived;
    }

    public static ArrayList findAll(String fileName) {
        //TODO finding dataToFind in file fileName
        String linea;
        ArrayList dataField;
        dataField = new ArrayList();
        FileReader file;
        BufferedReader read;
        try {
            File f = new File(fileName);

            file = new FileReader(fileName);

            if (f.exists()) {
                read = new BufferedReader(file);

                while ((linea = read.readLine()) != null) {
                    dataField.add(linea);
                }
                read.close();
            }
        } catch (IOException ex) {
            dataField = null;
        }
        return dataField;
    }

    public static boolean update(String fileName, String dataToFind, String dataToUpdate) {
        //TODO update Information

        boolean update;

        update = true;

        System.out.println("updating " + dataToFind + " in" + fileName);
        return update;
    }

    public static boolean delete(String fileNAme, String dataToDelete) {
        //TODO delete information

        boolean deleted;

        deleted = true;

        return deleted;
    }

}
