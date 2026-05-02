package com.example.hyrulecensus.Service;

import com.example.hyrulecensus.Domain.model.Material;
import com.example.hyrulecensus.Repository.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository MaterialRepository;

    public List<Material> obtenerTodosOrdenadosPorPrecioDesc() {
        return MaterialRepository.findAll().stream()
                .sorted(Comparator.comparingDouble(Material::getPrecioVenta).reversed())
                .collect(Collectors.toList());
    }

    public Material obtenerMaterialMasCaro() {
        return MaterialRepository.findAll().stream()
                .max(Comparator.comparingDouble(Material::getPrecioVenta))
                .orElse(null);
    }

    public List<Material> obtenerTodos() {
        return MaterialRepository.findAll();
    }
}
