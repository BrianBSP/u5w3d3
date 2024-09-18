package brianpelinku.u5w3d3.eserczio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Libro extends Componente {
    private String titolo;
    private List<Sezione> capitoli;
    private double prezzo;
    private List<String> autori;

    @Override
    public int getNumeroPagine() {
        return this.capitoli.stream().mapToInt(Sezione::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("---- LIBRO ----");
        System.out.println(this.getTitolo());
        this.capitoli.forEach(System.out::println);

    }
}
