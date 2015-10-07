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
        int[] vector = {1, 1, 12, 2, 3, 4, 5, 100, 100};

        Histogram histo = new Histogram(vector);
        
        HashMap<Integer, Integer> histogram = histo.getHisto();

        for (Integer key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
        }
    }
}
