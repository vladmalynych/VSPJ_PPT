
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomprokop
 */
public class Fibonacci {
    
    private HashMap<Integer, Integer> table;
    public int pocOpPriraz; // pocet opearcí přiřazení
    public int pocOpPorov; // pocet opearcí porovnání
    public int pocOpAriLog; // pocet opearcí aritmetických a logických
    public int soucetOp; // součet všech operací
    
    /*
     * Konstruktor
     */
    public Fibonacci(){

    }
    
    /*
     * Provádí výpočet prvku Fibonancciho posloupnosti nerekurzivním způsobem
     * @param n pořadí ntého prvku posloupnosti
     * @return Hodnota ntého prvku posloupnosti
     */
    public int calcNerek(int n){
        if (n == 0) {
            pocOpPorov += 1;
            soucetOp += 1;
            return 0;
        }
     
        if (n == 1){
            pocOpPorov += 1;
            soucetOp += 1;
            return 1;
        }

        int prvniClen = 0;
        int druhyClen = 1;
        int ntyClen = 1;
        pocOpPriraz += 3;
        soucetOp += 3;
        
        // int i = 2
        pocOpPriraz += 1;
        soucetOp += 1;
        for (int i = 2; i <= n; i++) {
            // i <= n
            pocOpPorov += 1;
            soucetOp += 1;
            ntyClen = prvniClen + druhyClen;
            prvniClen = druhyClen;
            druhyClen = ntyClen;
            pocOpPriraz += 3;
            pocOpAriLog += 1;
            soucetOp += 4;
            
            // i++
            pocOpPriraz += 1;
            pocOpAriLog += 1;
            soucetOp += 2;
        }
        return ntyClen;
    }
    
    /*
     * Provádí výpočet prvku Fibonancciho posloupnosti rekurzivním způsobem
     * @param n pořadí ntého prvku posloupnosti
     * @return Hodnota ntého prvku posloupnosti
     */
    public int calcRek(int n){
        if(n == 0){
            pocOpPorov += 1;
            soucetOp += 1;
            return 0;
	}
	if(n == 1 || n == 2){
            pocOpPorov += 2;
            pocOpAriLog += 1;
            soucetOp += 3;
            return 1;
        }
        // calcRek(n-2) + calcRek(n-1)
        pocOpAriLog += 3;
        soucetOp += 3;
	return calcRek(n-2) + calcRek(n-1);
    }
    
    /*
     * Provádí výpočet prvku Fibonancciho posloupnosti s využitím dynamického programování
     * @param n pořadí ntého prvku posloupnosti
     * @return Hodnota ntého prvku posloupnosti
     */
    public int calcRekTable(int n){
        if(table.containsKey(n)) return table.get(n);
        if(n == 0){
            pocOpPorov += 1;
            soucetOp += 1;
            return 0;
        }
        if(n == 1){
            pocOpPorov += 1;
            soucetOp += 1;
            return 1;
        }
        int ntyClen = calcRekTable(n - 1) + calcRekTable(n - 2);
        pocOpAriLog += 3;
        soucetOp += 3;
        table.put(n, ntyClen);
        System.out.println("Na pozici tabulky: "+ n + " zapisujeme hodnotu: " + ntyClen);
        pocOpPriraz += 1;
        soucetOp += 1;
        
        System.out.println("Obsah tabulky: " + table.toString());
        
        return ntyClen;
    }
    
    /*
     * Provádí inicializaci datové struktury pro využití v dynamickém programování
     */
    public void Init(){
        table = new HashMap<>();
    }
    
    /*
     * Provádí inicializaci atributů pro výpočet složitosti výpočtu
     */
    public void Init_CalcSlozitost(){
        this.pocOpAriLog = 0;
        this.pocOpPorov = 0;
        this.pocOpPriraz = 0;
        this.soucetOp = 0;
    }
}
