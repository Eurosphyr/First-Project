package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Publisher(
    String name
) {}