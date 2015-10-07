/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class CalculaHistogram {
    
    public static <T> Histogram<T> computeHisto(T[] vector) {
        
        Histogram<T> histo = new Histogram<>();
        
        for (T key : vector) {
            histo.increment(key);
        }
        
        return histo;
    }
}
