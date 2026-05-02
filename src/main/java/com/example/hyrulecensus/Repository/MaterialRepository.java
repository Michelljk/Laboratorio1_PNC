package com.example.hyrulecensus.Repository;

import com.example.hyrulecensus.Common.ListaMateriales;
import com.example.hyrulecensus.Domain.model.Material;
import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final ListaMateriales listaMateriales;

    public List<Material> findAll() {
        return listaMateriales.getMateriales();
    }
}