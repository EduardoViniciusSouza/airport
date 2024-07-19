package entities;

public class Bagagens {
    private Integer numero;
    private Float peso;
    private String aeronaveDeEmbarque;

    public Bagagens(Integer numero, Float peso, String aeronaveDeEmbarque) {
        this.numero = numero;
        this.peso = peso;
        this.aeronaveDeEmbarque = aeronaveDeEmbarque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getAeronaveDeEmbarque() {
        return aeronaveDeEmbarque;
    }

    public void setAeronaveDeEmbarque(String aeronaveDeEmbarque) {
        this.aeronaveDeEmbarque = aeronaveDeEmbarque;
    }

}
