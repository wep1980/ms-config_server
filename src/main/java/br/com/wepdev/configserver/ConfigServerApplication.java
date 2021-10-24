package br.com.wepdev.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Projeto que recebe algumas configurações de todos os micro serviços (configuração centralizada).
 *
 * Implementando o CommandLineRunner eu consigo testar se a variavel de ambiente que esta no properties e foi criada no windows, esta funcionando
 */
@EnableConfigServer // Habilitando a configuracao de servidor no projeto
@SpringBootApplication
public class ConfigServerApplication implements CommandLineRunner {


    // propriedade configurada no application properties e variavel criada na variavel de ambiente do windows
    @Value("${spring.cloud.config.server.git.username}")
    private String username;

    // propriedade configurada no application properties e variavel criada na variavel de ambiente do windows
    @Value("${spring.cloud.config.server.git.password}")
    private String password;




    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        System.out.println("usuário : " + username);
//        System.out.println("senha : " + password);
    }
}
