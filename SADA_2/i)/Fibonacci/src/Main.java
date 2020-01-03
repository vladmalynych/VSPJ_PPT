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
            Fibonacci fib1 = new Fibonacci();
            fib1.Init_CalcSlozitost();
            Fibonacci fib2 = new Fibonacci();
            fib2.Init_CalcSlozitost();
            Fibonacci fib3 = new Fibonacci();
            fib3.Init();
            fib3.Init_CalcSlozitost();
            
            int i1 = fib1.calcNerek(6);
            int i2 = fib2.calcRek(6);
            int i3 = fib3.calcRekTable(6);
            
            System.out.println("Vysledek-tab je: " + i1);
            System.out.println("Vysledek-tab je: " + i2);
            System.out.println("Vysledek-tab je: " + i3);
            
            System.out.println("Soucet vsech operaci: " + fib1.soucetOp + "; prirazeni: " + fib1.pocOpPriraz + "; porovnani: " + fib1.pocOpPorov + "; aritmLog: " + fib1.pocOpAriLog);
            System.out.println("Soucet vsech operaci: " + fib2.soucetOp + "; prirazeni: " + fib2.pocOpPriraz + "; porovnani: " + fib2.pocOpPorov + "; aritmLog: " + fib2.pocOpAriLog);
            System.out.println("Soucet vsech operaci: " + fib3.soucetOp + "; prirazeni: " + fib3.pocOpPriraz + "; porovnani: " + fib3.pocOpPorov + "; aritmLog: " + fib3.pocOpAriLog);
	}

    
}
