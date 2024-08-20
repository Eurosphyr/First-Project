package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Author(
    String url,
    String name
) {}
