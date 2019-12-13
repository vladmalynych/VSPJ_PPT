


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomprokop
 */
public class Main {
    
    
    	public static void main(String[] args) {
		
                KvadratickaFunkce f = new KvadratickaFunkce(1, 5, 4);
                //double fx = f.spocitejFunkcniHodnotu();
                //System.out.println("Funkcni hodnota je: " + fx);
                f.spocitejKoreny();
               // double[] n = ToolFunkce.spocitejVzorek_1(0.0, 10.0, 1.0, f);
                double[][] v1 = ToolFunkce.spocitejVzorek_2(0.0, 10.0, 1.0, f);
                Vzorek[] v2 = ToolFunkce.spocitejVzorek_3(0.0, 10.0, 1.0, f);
                System.out.println("prvni vzorek je: x= " + v1[0][0] + " fx= "+ v1[0][1]);
                System.out.println("druhy vzorek je: x= " + v1[1][0] + " fx= "+ v1[1][1]);
                System.out.println("treti vzorek je: x= " + v1[2][0] + " fx= "+ v1[2][1]);
                Tool_IO.zapisVzorkyDat(v2);
	}


}
