package com.example.hyrulecensus;

import com.example.hyrulecensus.Service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HyruleCensusApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyruleCensusApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(MaterialService materialService) {
        return args -> {

            materialService.obtenerTodos().forEach(m ->
                    System.out.printf("[HYRULE-DB] Nombre: %s | Categoría: %s | Precio: %.0f Rupias\n",
                            m.getNombre(), m.getCategoria(), m.getPrecioVenta())
            );
        };
    }
}
