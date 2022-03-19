package br.com.jeansemolini.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(WebServiceClient client) {
        return args -> {
            System.out.println("Resultado da operação: 1 + 2 = " + client.somar().getAddIntegerResult());
            System.out.println("Resultado da operação: 10 / 2 = " + client.dividir().getDivideIntegerResult());
            System.out.println("Resultado da busca da pessoa com ID 1: " + client.buscarPessoa().getFindPersonResult().getName());
        };
    }

}
