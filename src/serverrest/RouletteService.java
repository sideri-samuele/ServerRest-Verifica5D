/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param 
     * @param 
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    
    public boolean logicaDiCalcolo(String giocata, String numero) throws IllegalArgumentException {
        // Controllo se i parametri passati sono validi
        if (!parametriValidi(giocata, numero)) {
        } else {
            throw new IllegalArgumentException("Giocata non può essere diversa da PARI, DISPARI o mancante");
        }
        
        try {
            int n = Integer.parseInt(numero);
            if (n == 0) {
                return false;
            }
            
            if (giocata.equalsIgnoreCase("PARI")){
                return n % 2 == 0;
            }
            
            if (giocata.equalsIgnoreCase("DISPARI")){
                return n % 2 != 0;
            }else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Opzione non valida.");
        }
    }

    // Metodo di validazione dei parametri (da implementare)
    private boolean parametriValidi(String giocata, String numero)
    {
        return giocata != null && !giocata.isEmpty() && numero != null && !numero.isEmpty();
    }
}
