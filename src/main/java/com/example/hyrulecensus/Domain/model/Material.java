package com.example.hyrulecensus.Domain.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {
    private String nombre;
    private String categoria;
    private double precioVenta;

}
