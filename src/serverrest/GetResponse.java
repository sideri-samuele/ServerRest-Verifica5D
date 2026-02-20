/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class GetResponse {
    public String giocata;
    public String numero;
    public boolean vittoria;
    
    // Costruttore vuoto necessario per GSON
    public GetResponse() {
    }
    
    // Costruttore con parametri
    public GetResponse(String giocata, String numero, boolean vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }
    
    // Getter
    public String getGiocata() {
        return giocata;
    }

    public String getNumero() {
        return numero;
    }

    public boolean isVittoria() {
        return vittoria;
    }
    
    // Setter

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setVittoria(boolean vittoria) {
        this.vittoria = vittoria;
    }
}