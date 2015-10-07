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
        Integer[] vector = {1, 1, 12, 2, 3, 4, 5, 100, 100, 100,12};

        //Vectores de Strings
        String[] vector1 = {"Ana", "Juan", "Pedro", "Lucía", "Pedro", "Lucía"};

        Histogram<Integer> histogram = CalculaHistogram.computeHisto(vector);

        //Recorremos el histograma para mostrar los resultados
        for (Object key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
        }
    }
}
