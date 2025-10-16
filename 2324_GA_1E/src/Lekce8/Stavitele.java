/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce8;

/**
 *
 * @author ali.yunussov.s
 */
public class Stavitele {
    public static void main(String[] args) {
        // NEPOUZIVAT buffer, ale builder, je rychlejsi
        StringBuffer buf = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append ("Hello") .append("World");
        System.out.println(sb.toString());
        
        StringBuilder mail = new StringBuilder ();
        boolean zena = true;
        double cena = 123.45;
        if(zena) {
            mail.append("Vazena pani");
        } else {
            mail.append("Vazeny pane");
        }
        mail.append(", na zaklade vasi objednavky vam zasilame ");
        mail.append("fakturu za ");
        mail.append(cena);
        mail.append(" Kc.");
        
        System.out.println(mail.toString());
        System.out.println(serieCisel(3,2));
    }
    
    public static String serieCisel(int odKolika, int doKolika) {
        // 3 a 7: 3,4,5,6,7
        if(odKolika > doKolika) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(odKolika));
        
        for(int i = odKolika + 1; i <= doKolika; i++) {
            sb.append(i);
            sb.append(",");
        }
//        if(sb.length() > 0)
//        sb.delete(sb.length()-1, sb.length());
//        sb.append(doKolika);
        
        return sb.toString();
    }
}
