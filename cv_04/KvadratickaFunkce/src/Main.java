


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
            Vzorek[] v = ToolFunkce.spocitejVzorek_3(0.0, 10.0, 1.0, f);

            f.ulozFunkci(f, v);
            Tool_IO.cteniVzorkyDat();
	}


}
