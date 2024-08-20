package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Subject(
    @JsonAlias("name") String name,
    @JsonAlias("url") String url
) {}