
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    public static void zapisVzorkyDat(Vzorek[] v){
                try {
            FileWriter fileWriter = new FileWriter("vzorky.txt");    // -- throw IOException
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //BufferedWriter bufferedWriter = new BufferedWriter("data_form.txt");

            for (int i = 0; i < v.length; i++){
                bufferedWriter.write(Double.toString(v[i].getX()));
                bufferedWriter.newLine();
                bufferedWriter.write(Double.toString(v[i].getFx()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            //throw e;
             System.out.println("Doslo k chybe pri zapisu dat!");
        }
    }
}
