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
public class PastelesFactory {
    public static Pastel getPastel(TipoPastel criteria) {
        switch (criteria) {
            case PEQUEÑO:
                return new Fruta();
            case MEDIANO:
                return new Chocolate();
            case GRANDE:
                return new Caramelo();
        }
        return null;
    }
}
