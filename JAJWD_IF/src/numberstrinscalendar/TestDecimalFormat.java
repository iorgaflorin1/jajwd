/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberstrinscalendar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author gheor
 */
public class TestDecimalFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print out a number using the localized number, integer, currency,
         // and percent format for each locale
         Locale[] locales = NumberFormat.getAvailableLocales();
         double myNumber = -1234.56;
         NumberFormat form;
         for (int j=0; j<4; ++j) {
             System.out.println("FORMAT");
             for (int i = 0; i < locales.length; ++i) {
                 if (locales[i].getCountry().length() == 0) {
                    continue; // Skip language-only locales
                 }
                 System.out.print(locales[i].getDisplayName());
                 switch (j) {
                 case 0:
                     form = NumberFormat.getInstance(locales[i]); break;
                 case 1:
                     form = NumberFormat.getIntegerInstance(locales[i]); break;
                 case 2:
                     form = NumberFormat.getCurrencyInstance(locales[i]); break;
                 default:
                     form = NumberFormat.getPercentInstance(locales[i]); break;
                 }
                 if (form instanceof DecimalFormat) {
                     System.out.print(": " + ((DecimalFormat) form).toPattern());
                 }
                 System.out.print(" -> " + form.format(myNumber));
                 try {
                     System.out.println(" -> " + form.parse(form.format(myNumber)));
                 } catch (ParseException e) {}
             }
         }
    }
    
}
