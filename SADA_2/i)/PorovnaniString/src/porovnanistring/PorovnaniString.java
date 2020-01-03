/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porovnanistring;

/**
 *
 * @author tprokop
 */
public class PorovnaniString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = StringsTools.NactiRetezec();
        String s2 = StringsTools.NactiRetezec();
        
        StringsTools.PorovnejRetezce(s1, s2);
    }
    
}
