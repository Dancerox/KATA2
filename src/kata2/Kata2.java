/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vector de enteros
        Integer[] vector = {1, 1, 12, 2, 3, 4, 5, 100, 100};

        //Vectores de Strings
        String[] vector1 = {"Ana","Juan","Pedro","Lucía","Pedro","Lucía"};
        
        //Creamos un objeto de tipo Histogram
        Histogram histo = new Histogram(vector1);
        
        
        HashMap<Object, Integer> histogram = histo.getHisto();

        for (Object key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
        }
    }
}
