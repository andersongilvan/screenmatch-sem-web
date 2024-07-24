package br.com.screenmatch.screenmatch;

import br.com.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Principal principal = new Principal();
        principal.exibeMenu();

        List<String> nomes = Arrays.asList("Anderso", "Adriano", "Ana", "Maria", "Zé");
        nomes.stream().sorted().forEach(System.out::println);


    }

}
