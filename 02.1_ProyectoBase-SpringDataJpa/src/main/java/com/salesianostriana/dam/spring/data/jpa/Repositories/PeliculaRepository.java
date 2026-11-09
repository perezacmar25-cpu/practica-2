package com.salesianostriana.dam.spring.data.jpa.Repositories;

import com.salesianostriana.dam.spring.data.jpa.Model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
