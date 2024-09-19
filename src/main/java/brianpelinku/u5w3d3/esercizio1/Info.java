package brianpelinku.u5w3d3.esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
}
