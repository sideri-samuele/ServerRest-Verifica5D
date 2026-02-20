/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ServerService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param 
     * @param 
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    
    GetRequest request = new GetRequest();
    public int n = request.getNumero();
    public String gioc = request.getGiocata();
    public boolean vitt;
    
    public boolean logicaDiCalcolo() 
            throws IllegalArgumentException {
        // Controllo se i parametri passati sono validi
                if (!parametriValidi()) {
            throw new IllegalArgumentException("Giocata non può essere diversa da PARI o DISPARI");
        }
        
        try {
            switch(gioc){
                case "PARI":
                    if(n % 2 == 0){
                        vitt = true;
                    }else if(n % 2 != 0 || n == 0) {
                        vitt = false;
                    }
                break;
                
                case "DISPARI":
                    if(n % 2 == 0 || n == 0){
                        vitt = false;
                    }else {
                        vitt = true;
                    }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        return vitt; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi()
    {
        
        return false;
    }
}
