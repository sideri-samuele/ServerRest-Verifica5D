/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class GetRequest {
    public String giocata;
    public int numero;
    
    // Costruttore vuoto necessario per GSON
    public GetRequest() {
    }
    
    // Costruttore con parametri  
    public GetRequest(String giocata, int numero) {
        this.giocata = giocata;
        this.numero = numero;
    }
    
    // Getter
    public String getGiocata() {
        return giocata;
    }
    
    public int getNumero() {
        return numero;
    }
    
    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    // ToString

    @Override
    public String toString() {
        return "giocata:" + giocata + " numero:" + numero;
    }
}