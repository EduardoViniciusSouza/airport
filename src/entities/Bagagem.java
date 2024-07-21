package entities;

import entities.enums.TipoBagagem;

public class Bagagem {
    private Double peso;
    private TipoBagagem tipoBagagem;
    private String destino;

    public Bagagem(Double peso, TipoBagagem tipoBagagem, String destino) {
        this.peso = peso;
        this.tipoBagagem = tipoBagagem;
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoBagagem getTipoBagagem() {
        return tipoBagagem;
    }

    public void setTipoBagagem(TipoBagagem tipoBagagem) {
        this.tipoBagagem = tipoBagagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "( Peso: " + getPeso() +
                " Tipo da Bagem: " + getTipoBagagem() +
                " Destino: " + getDestino() + " )" + System.lineSeparator();
    }
}
