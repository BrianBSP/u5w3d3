package brianpelinku.u5w3d3.eserczio1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void setData(DataSource dataSource) {
        nomeCompleto = dataSource.getNomeCompleto();
        eta = dataSource.getEta();
    }
}
