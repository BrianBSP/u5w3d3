package brianpelinku.u5w3d3.eserczio1;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*\n**\n*** ADAPTER");
        System.out.println("**\n*");
        Faker faker = new Faker(Locale.ITALY);
        Info info = new Info(faker.dragonBall().character(), faker.name().lastName(), faker.date().birthday());
        Adapter adapter = new Adapter(info);
        UserData userData = new UserData();
        userData.setData(adapter);
        System.out.println(userData);
    }
}
