package entities;

import java.util.Arrays;

public class Passageiro {
    private String nome;
    private String email;
    private String cpf;
    private Bagagens [] bagagens;

    public Passageiro(String nome, String email, String cpf, Bagagens [] bagagens) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.bagagens = bagagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;


    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf;
    }
}
