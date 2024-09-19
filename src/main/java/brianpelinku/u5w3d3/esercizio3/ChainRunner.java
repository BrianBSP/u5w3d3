package brianpelinku.u5w3d3.esercizio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*\n**\n*** CHAIN");
        System.out.println("**\n*");
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        capitano.doCheck(4000);
    }
}
