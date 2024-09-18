package brianpelinku.u5w3d3.eserczio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Sezione extends Componente {
    private String nomeSezione;
    private List<Componente> componenti;

    @Override
    public int getNumeroPagine() {
        return this.componenti.stream().mapToInt(Componente::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("---- SEZIONE ----");
        System.out.println(this.nomeSezione);
        this.componenti.forEach(System.out::println);
    }
}
