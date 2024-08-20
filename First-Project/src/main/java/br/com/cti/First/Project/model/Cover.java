package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Cover ( String small,
String medium,
String large
) {}

