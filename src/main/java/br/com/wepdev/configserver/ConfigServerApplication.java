package br.com.wepdev.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Projeto que recebe algumas configurações de todos os micro serviços (configuração centralizada)
 */
@EnableConfigServer // Habilitando a configuracao de servidor no projeto
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
