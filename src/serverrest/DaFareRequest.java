/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareRequest {
    private String giocata;
    private String numero;
    private boolean vittoria;
    
    // Costruttore vuoto necessario per GSON
    public DaFareRequest() {
    }
    
    // Costruttore con parametri  
    public DaFareRequest(String giocata, String numero, boolean vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }
    
    // Getter
    public String getGiocata() {
        return giocata;
    }

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public String getNumero() {
        return numero;
    }
    
    // Setter
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isVittoria() {
        return vittoria;
    }

    public void setVittoria(boolean vittoria) {
        this.vittoria = vittoria;
    }

    // ToString

    @Override
    public String toString() {
        return "giocata " + giocata + " vittoria " + vittoria + " numero " + numero;
    }
    
    

    

    
    
}