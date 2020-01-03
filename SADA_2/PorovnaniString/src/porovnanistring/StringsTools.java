/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porovnanistring;

import java.util.Scanner;

/**
 *
 * @author tprokop
 */
public class StringsTools {
    
    
    public static String NactiRetezec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte retezec:");
        String s = sc.nextLine();

        return s;
    }
    
    public static Boolean PorovnejRetezce(String s1, String s2){
      //  String s1 = NactiString();
      //  String s2 = NactiString();
      if (s1.length() != s2.length()) {       
            System.out.println("Retezce nejsou stejne.\n");
            return false;
      } else {
            for (int i = 0; i < s1.length(); i++) { 
                int str1_ch = (int)s1.charAt(i); 
                int str2_ch = (int)s2.charAt(i); 

                if (str1_ch != str2_ch) { 
                    System.out.println("Retezce nejsou stejne.\n");
                    return false;
                } 
            } 
      }
        System.out.println("Retezce jsou stejne.\n");
        return true;
    }
}
