/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasteles;

/**
 *
 * @author HP PC
 */
public class Pasteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a small dog
        Pastel pastel = PastelesFactory.getPastel(TipoPastel.PEQUEÑO);
        pastel.crear();

        // create a big dog
        pastel = PastelesFactory.getPastel(TipoPastel.MEDIANO);
        pastel.crear();

        // create a working dog
        pastel = PastelesFactory.getPastel(TipoPastel.GRANDE);
        pastel.crear();
    
    }
    
}
