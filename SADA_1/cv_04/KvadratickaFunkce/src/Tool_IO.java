
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomprokop
 */
public class Tool_IO {
    
    /*
     * Provede zapis vzorku dat funkce do souboru
     */
    public static void zapisVzorkyDat(Vzorek[] v){
        try {
            FileWriter fileWriter = new FileWriter("vzorky.txt");    // -- throw IOException
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //BufferedWriter bufferedWriter = new BufferedWriter("data_form.txt");

            for (int i = 0; i < v.length; i++){
                bufferedWriter.write(Double.toString(v[i].getX()));
                // bufferedWriter.newLine();
                bufferedWriter.write(" ");
                bufferedWriter.write(Double.toString(v[i].getFx()));
                bufferedWriter.newLine();
            }
            System.out.println("Vzorky funkce byly zapsany do souboru vzorky.txt!");
            bufferedWriter.close();
        }
        catch (IOException e) {
            //throw e;
             System.out.println("Doslo k chybe pri zapisu dat!");
        }
    }
    
    /*
     * Provede zapis informaci o funkci do souboru
     */
    public static void zapisFceInfo(KvadratickaFunkce f){
        try {
            FileWriter fileWriter = new FileWriter("funkceInfo.txt");    // -- throw IOException
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(f.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(f.spocitejKoreny());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Informace o funkci byla zapsana do souboru funkceInfo.txt!");
        }
        catch (IOException e) {
            //throw e;
             System.out.println("Doslo k chybe pri zapisu dat!");
        }
    }
    
    /*
     * Provede nacteni vzorku dat funkce ze souboru (a jejich textovy vypis)
     */
    public static void cteniVzorkyDat(){
        System.out.println("Cteni dat o vzorcich ze souboru ");
        try
        {
            FileReader fileReader = new FileReader("vzorky.txt");  // throws FileNotFoundException
            BufferedReader bufferedReader = new BufferedReader(fileReader);
   
            String line;
            double x;
            double fx;
            
            while ((line = bufferedReader.readLine()) != null) {
               // Scanner scanner = new Scanner(line);  
                String[] edge = line.split(" ");
                x = Double.parseDouble(edge[0]);
                fx = Double.parseDouble(edge[1]);
                System.out.println("Hodnota x: " + x + " a hodnota fx: " + fx);
            }
            fileReader.close(); // !!!   
        }
        catch (FileNotFoundException e) {
            System.out.println("Doslo k chybe pri cteni dat. Soubor nenalezen!");
        }
        catch (IOException e) {
            //throw e;
             System.out.println("Doslo k chybe pri cteni dat!");
        }
    }

}
