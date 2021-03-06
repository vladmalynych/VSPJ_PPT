/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner; // !!!!! POZOR

/**
 *
 * @author tomprokop
 */
public class KvadratickaFunkce {
    
    // parametry funkce
    private double a;
    private double b;
    private double c;
    
    
    public KvadratickaFunkce(double a, double b, double c)
    {
        setA(a);
        setB(b);
        setC(c);
    }
    
    
    public void setA(double a)
    {
        this.a = (a > 0) ? a : 0;
    }

    public double getA()
    {
        return a;
    }
    
    public void setB(double b)
    {
        this.b = (b > 0) ? b : 0;
    }
    
    public double getB()
    {
        return b;
    }
    
    public void setC(double c)
    {
        this.c = (c > 0) ? c : 0;
    }

    public double getC()
    {
        return c;
    }
    
    public double spocitejFunkcniHodnotu()
    {
        double x, fx;
        System.out.print("Zadejte hodnotu x:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        x = Double.valueOf(s);
        fx = 0;
        fx = a * x * x + b * x + c;
        
        return fx;
    }
    
    public double spocitejFunkcniHodnotuV(double x)
    {
        double fx;
        fx = 0;
        fx = a * x * x + b * x + c;
        
        return fx;
    }
    
    public String spocitejKoreny()
    {
        double determinant = b * b - 4 * a * c;
        double koren1;
        double koren2;

        if (determinant > 0) {
            koren1 = (-b + Math.sqrt(determinant))/(2 * a);
            koren2 = (-b - Math.sqrt(determinant))/(2 * a);
            return ("Koren c.1: " + koren1 + ", koren c.2: " + koren2);
        }
        if (determinant == 0) {
            koren1 = koren2 = -b/(2*a);
            return ("Koren ma hodnotu: " + koren1);
        }

        return ("Rovnice nema reseni!");
    }
    
    @Override
    public String toString()
    {
        return ("Zápis rovnice: "+ a + "x*x + " + b + "x + " + c);
    }
    
    public void ulozFunkci(KvadratickaFunkce f, Vzorek[] v){
        Tool_IO.zapisFceInfo(f);
        Tool_IO.zapisVzorkyDat(v);
    }
    
}
