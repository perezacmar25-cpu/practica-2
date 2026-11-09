package com.salesianostriana.dam.spring.data.jpa.Repositories;

import com.salesianostriana.dam.spring.data.jpa.Model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
