package brianpelinku.u5w3d3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Pagina extends Componente {
    private int numeroPagine;

    @Getter
    private String contenuto;

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Numero di pagine " + this.numeroPagine);
        System.out.println(this.contenuto);
    }
}
