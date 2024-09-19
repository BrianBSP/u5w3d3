package brianpelinku.u5w3d3.esercizio2;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*\n**\n*** COMPOSITE");
        System.out.println("**\n*");

        Faker faker = new Faker(Locale.ITALY);

        Pagina pagina1 = new Pagina(1, faker.harryPotter().quote());
        Pagina pagina2 = new Pagina(2, faker.harryPotter().quote());
        Pagina pagina3 = new Pagina(3, faker.harryPotter().quote());
        Pagina pagina4 = new Pagina(4, faker.harryPotter().quote());
        Pagina pagina5 = new Pagina(5, faker.harryPotter().quote());
        Pagina pagina6 = new Pagina(6, faker.harryPotter().quote());
        Pagina pagina7 = new Pagina(7, faker.harryPotter().quote());
        Pagina pagina8 = new Pagina(8, faker.harryPotter().quote());
        Pagina pagina9 = new Pagina(9, faker.harryPotter().quote());
        Pagina pagina10 = new Pagina(10, faker.harryPotter().quote());

        Sezione sottoCapitolo1 = new Sezione("SottoCapitolo 1", Arrays.asList(pagina1, pagina2));
        Sezione sottoCapitolo2 = new Sezione("SottoCapitolo 2", Arrays.asList(pagina3, pagina4));
        Sezione sottoCapitolo3 = new Sezione("SottoCapitolo 3", Arrays.asList(pagina5, pagina6));
        Sezione sottoCapitolo4 = new Sezione("SottoCapitolo 4", Arrays.asList(pagina7, pagina8));
        Sezione sottoCapitolo5 = new Sezione("SottoCapitolo 5", Arrays.asList(pagina9, pagina10));

        Sezione capitolo1 = new Sezione("Capitolo 1", Arrays.asList(sottoCapitolo1, sottoCapitolo2));
        Sezione capitolo2 = new Sezione("Capitolo 2", Arrays.asList(sottoCapitolo3, sottoCapitolo4, sottoCapitolo5));

        Libro libro = new Libro(faker.harryPotter().book(), Arrays.asList(capitolo1, capitolo2), 30, Arrays.asList(faker.harryPotter().character(), faker.harryPotter().character(), faker.harryPotter().character(), faker.harryPotter().character()));

        libro.stampa();

        System.out.println("Il libro " + libro.getTitolo() + " ha " + libro.getNumeroPagine() + " pagine.");

    }
}
