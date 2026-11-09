package com.salesianostriana.dam.spring.data.jpa;

import com.salesianostriana.dam.spring.data.jpa.Model.Critica;
import com.salesianostriana.dam.spring.data.jpa.Model.Genero;
import com.salesianostriana.dam.spring.data.jpa.Model.Pelicula;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataSeed {


    @PostConstruct
    public void cargarDatos(){

        Pelicula p = new Pelicula("El Rey León","2010");
        Pelicula p2 = new Pelicula("Cars","2009");
        Critica c = new Critica("Mario","Está guapa",10.0,p);
        Critica c2 = new Critica("Luismi","Me gusta",9.5,p2);
        Critica c3 = new Critica("Raúl","No me da tiempo",5,p);
        Genero g = new Genero("Drama");
        Genero g2 = new Genero("Carreras");

        p.addCritica(c);
        p.addCritica(c3);
        p2.addCritica(c2);
        p.addGenero(g);
        p2.addGenero(g);



    }
}
