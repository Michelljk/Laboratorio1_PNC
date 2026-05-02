package com.example.hyrulecensus.Common;
import com.example.hyrulecensus.Domain.model.Material;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaMateriales {
    private final List<Material> materiales;

    public ListaMateriales() {
        this.materiales = new ArrayList<>();

        this.materiales.add(Material.builder()
                .nombre("Ámbar Rojo")
                .categoria("Mineral")
                .precioVenta(30.0)
                .build());

        this.materiales.add(Material.builder()
                .nombre("Ala de Keese")
                .categoria("Parte de Monstruo")
                .precioVenta(15.0)
                .build());

        this.materiales.add(Material.builder()
                .nombre("Pimienta Ardiente")
                .categoria("Planta")
                .build());

        this.materiales.add(Material.builder()
                .nombre("Diamante")
                .categoria("Mineral")
                .precioVenta(500.0)
                .build());

        this.materiales.add(Material.builder()
                .nombre("Fragmento de Estrella")
                .categoria("Mineral")
                .precioVenta(300.0)
                .build());

        this.materiales.add(Material.builder()
                .nombre("Rábano Vivaz")
                .categoria("Comida")
                .precioVenta(20.0)
                .build());
    }

    public List<Material> getMateriales() {
        return materiales;
    }
}
