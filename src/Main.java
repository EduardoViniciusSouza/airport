import entities.Bagagem;
import entities.Passageiro;
import entities.enums.TipoBagagem;
import entities.enums.Visto;

public class Main {
    public static void main(String[] args) {
        Bagagem bagagem = new Bagagem(10.0, TipoBagagem.CIVIL, "Panamá");
        Bagagem bagagem2 = new Bagagem(5.0, TipoBagagem.CIVIL, "Panamá");

        Passageiro passageiro = new Passageiro("Eduardo", "101029", Visto.APROVADO);
        passageiro.addBagagem(bagagem);
        passageiro.addBagagem(bagagem2);

        System.out.println(passageiro);
    }
}