package com.salesianostriana.dam.spring.data.jpa.Model;


import com.salesianostriana.dam.spring.data.jpa.Repositories.CriticaRepository;
import com.salesianostriana.dam.spring.data.jpa.Repositories.PeliculaRepository;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Pelicula implements Serializable {

    @Id @GeneratedValue
    private Long id;

    private String titulo;

    private String anioEstreno;

    private CriticaRepository criticaRepository;

    @OneToMany(mappedBy = "pelicula",orphanRemoval = true,cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Critica> criticas = new HashSet<>();

    @OneToMany(mappedBy = "pelicula",orphanRemoval = true,cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private Set<Genero> generos = new HashSet<>();

    public Pelicula(String elReyLeón, String number) {
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Pelicula pelicula = (Pelicula) o;
        return getId() != null && Objects.equals(getId(), pelicula.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

    public void addCritica (Critica critica){
        criticas.add(critica);

    }

    public void removeCritica(Critica critica){
        criticas.remove(critica);

    }

    public void addGenero(Genero genero){
        generos.add(genero);
    }

    public void removeGenero(Genero genero){
        generos.remove(genero);
    }
}
