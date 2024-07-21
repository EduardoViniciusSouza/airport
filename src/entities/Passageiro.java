package entities;

import entities.enums.Visto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Passageiro {
    private String nome;
    private String numeroDePassaporte;
    private Visto visto;
    private List<Bagagem> bagagens;

    public Passageiro(String nome, String numeroDePassaporte, Visto visto) {
        this.nome = nome;
        this.numeroDePassaporte = numeroDePassaporte;
        this.visto = visto;
        this.bagagens = new ArrayList<>();
    }

    public void addBagagem(Bagagem bagagem) {
        bagagens.add(bagagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDePassaporte() {
        return numeroDePassaporte;
    }

    public void setNumeroDePassaporte(String numeroDePassaporte) {
        this.numeroDePassaporte = numeroDePassaporte;
    }

    public Visto getVisto() {
        return visto;
    }

    public void setVisto(Visto visto) {
        this.visto = visto;
    }
    
    public Collection<Bagagem> getBagagens(){
        return bagagens;
    }

    @Override
    public String toString() {
        return "Nome do Passageiro: " + getNome() + System.lineSeparator() +
                "Número de Passaporte: " + getNumeroDePassaporte() + System.lineSeparator() +
                "Situação do Visto: " + getVisto() + System.lineSeparator() +
                "Bagagens cadastradas: "+ System.lineSeparator() + getBagagens();
    }
}

