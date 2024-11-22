package com.example.demo.controller;

import com.example.demo.model.Cafe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CafeController {
    private List<Cafe> cafes = new ArrayList<>();

    public CafeController() {
        cafes.addAll(List.of(
                new Cafe(1, "Café Cereza"),
                new Cafe(2, "Café Ganador"),
                new Cafe(3, "Café Lareño"),
                new Cafe(4, "Café Três Pontas")
        ));
    }

    @GetMapping("/cafes")
    Iterable<Cafe> getCafes() {
        return cafes;
    }

    @GetMapping("/cafes/{id}")
    Optional<Cafe> getCafe(@PathVariable int id) {
        for (Cafe c: cafes) {
            if (c.getId() == id) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }
}
