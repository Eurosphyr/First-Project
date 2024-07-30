package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title")
String titulo,
 @JsonAlias("totalSeasons")
Integer totalTemporadas,
 @JsonAlias("imdbRating")
String avaliacao) {
}

