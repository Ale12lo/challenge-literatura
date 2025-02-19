package com.aluracursos.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record datosLibros(

        @JsonAlias("title") String titulo,

        @JsonAlias("authors") String autor,

        @JsonAlias("languages") String idiomas,

        @JsonAlias("download_count")Integer numeroDeDescargas){

}
