/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomprokop
 */
public class ToolFunkce {
    
    public static double[] spocitejVzorek_1(double x0, double x1, double krok, KvadratickaFunkce f)
    {
        int n; // pocet vzorku
        double x = x0;
        n = (int)((x1 - x0) / krok);
        double[] fx = new double[n];
        // System.out.println("Pocet kroku je: " + n);
        for(int i = 0; i < n; i++){
            fx[i] = f.spocitejFunkcniHodnotuV(x);
            x = x + krok;
        }
      
        return fx;
    }
    
    public static double[][] spocitejVzorek_2(double x0, double x1, double krok, KvadratickaFunkce f)
    {
        // todo
        int n=0; // pocet vzorku
        double x = x0;
        n = (int)((x1 - x0) / krok);
        double[][] fx = new double[n][2];
        
        System.out.println("Pocet kroku je: " + n);
        for(int i = 0; i < n; i++){
            fx[i][0] = x;
            fx[i][1] = f.spocitejFunkcniHodnotuV(x);
            x = x + krok;
        }   
        
        return fx;
    }
    
    public static Vzorek[] spocitejVzorek_3(double x0, double x1, double krok, KvadratickaFunkce f)
    {
        int n; // pocet vzorku
        double x = x0;
        n = (int)((x1 - x0) / krok);
        Vzorek[] fx = new Vzorek[n];
        // System.out.println("Pocet kroku je: " + n);
        for(int i = 0; i < n; i++){
            Vzorek v = new Vzorek(x,f.spocitejFunkcniHodnotuV(x));
            fx[i] = v;
            x = x + krok;
        }    
        return fx;
    }
    
}
